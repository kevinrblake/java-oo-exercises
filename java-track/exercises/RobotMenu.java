import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu 
{

	private ArrayList<Robot> robots;
	private Scanner s;

	public static void main(String[] args)
	{
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6);
	}

	public RobotMenu()
	{
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}

	public int startMenu()
	{
		System.out.println("Welcome the the Robot menu!");
		System.out.println("1: Create a Robot");
		System.out.println("2: Display a list of available Robots");
		System.out.println("3: Move a Robot");
		System.out.println("4: Rotate a Robot");
		System.out.println("5: Compute the distance between two robots");
		System.out.println("6: Exit");

		int selection = s.nextInt();

		while(selection < 0 || selection >6)
		{
			System.out.println("Invalid selection: please choose again:");
			selection = s.nextInt();
		}
		return selection;
	}
	public void processInput(int selection)
	{
		if (selection == 1)
		{
			robots.add(createRobot());
		}
		else if (selection == 2)
		{
			displayRobots();
		}
		else if (selection == 3)
		{
			displayRobots();
			Robot r = selectRobot();
			r.move();
		}
		else if (selection == 4)
		{
			displayRobots();
			Robot r = selectRobot();
			changeOrientation();
			r.setOrientation(changeOrientation());

		}
		else if (selection == 5)
		{
			displayRobots();
			Robot r = selectRobot();
			displayRobots();
			Robot q = selectRobot();
			System.out.println("The distance between the robots you chose is: " + r.distance(q));
		}
	}
	private void displayRobots()
	{
		for (int i = 0; i < robots.size(); i++)
		{
			
			System.out.println((i+1) + "." + robots.get(i));
		}
		System.out.println("\n");

	}
	private Robot selectRobot()
	{
		System.out.println("Please select a Robot: ");
		int selection = s.nextInt();
		while (selection < 0 || selection > robots.size())
		{
			System.out.println("Invalid selection, try again, sucka!");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	private String changeOrientation()
	{
		System.out.println("Which way would you like the Robot to turn?");
		System.out.println("1. North");
		System.out.println("2. South");
		System.out.println("3. East");
		System.out.println("4. West");

		int selection = s.nextInt();
		while (selection <0 || selection > 4)
		{
			System.out.println("Invalid selection, try again, foo!");
			selection = s.nextInt();
		}
		switch (selection)
		{
		case 1: return "north";

		case 2: return "south";

		case 3: return "east";

		case 4: return "west";

		default: return "nothing";
		}
	}

	private Robot createRobot()
	{
		System.out.println("What do you want to name your robot?");
		String name = s.next();
		System.out.println("What is its1 speed?");
		double speed = s.nextDouble();
		System.out.println("What is its x coordinate?");
		double xPos = s.nextDouble();
		System.out.println("What is its y coordinate?");
		double yPos = s.nextDouble();
		System.out.println("What is its orientation (north, south, east, or west)?");
		String orientation = s.next();
		int w = 0;
		while (w != 1)
		{
			switch (orientation)
			{
			case "north":

			case "south":

			case "east":

			case "west": 	w = 1;
			break;

			default: System.out.println("Invalid selection: please choose either north, south, east, or west.");
			orientation = s.next(); 
			}
		}
		Robot bob = new Robot(name, speed, xPos, yPos, orientation);
		System.out.println("You have created: " + bob.toString() + "\n");
		return bob;	
	
	}
}






