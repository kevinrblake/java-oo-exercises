import java.util.Scanner;

public class Questions 
{
	public Scanner sc = new Scanner(System.in);	

	public Questions()
	{
		
	}
	public String chooser()
	{
		double choice = (Math.random() * 3);

		if (choice > 2.0)
		{
			return question3();
		}
		else if (choice > 1)
		{
			return question1();
		}
		else 
		{
			return question2();
		}
	}
	
	public String question1()
	{
		System.out.println("How many Stooges were there (between 1 and 4)");
		int answer = sc.nextInt();
		if (answer == 3 || answer == 4)
		{
			return "You're right, even if you remembered Shemp, you knucklehead!";
		}
		else 
		{
			return "You are wrong, WUBBU WUBU WUBBU!";
		}
	}

	public String question2()
	{
		System.out.println("How many amigos are there (between 1 and 5)");
		int answer = sc.nextInt();
		if (answer != 3)
		{
			return "You are wrong, partner!";
		}
		else 
		{
			return "Bueno! You are correct!";
		}
	}

	public String question3()
	{
		System.out.println("Name one of the Three Musketeers.");
		String answer = sc.next();
		answer = answer.toLowerCase();
		switch(answer)
		{
		case "aramis":
		case "athos":
		case "porthos":
		case "dartagnon":
		case "d'artagnon": return "You are correct!";
		default: return "You are so wrong I should challenge you to a duel!";
		}
	}
	
	public static void main(String[] args) {
		Questions q = new Questions();
		boolean again = true;
		
		while (again)
		{
			String answer = q.chooser();
			System.out.println(answer);
			System.out.println("");
			System.out.println("Do you want to answer another question? Y/N");
			String more = q.sc.next();
			more = more.toLowerCase();
			System.out.println(more);
			if (more == "y")
			{
				again = true;
			}
			else 
			{
				again = false;
			}
		}
		

	}
}
