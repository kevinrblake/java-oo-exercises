

public class Robot {
	private String name;
	private double speed;
	private double xPos;
	private double yPos;
	private String orientation;
	
	public Robot(String name, double speed, double xPos, double yPos, String orientation)
	{
	this.name = name;
	this.xPos = xPos;
	this.yPos = yPos;
	this.orientation = orientation;
	this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getxPos() {
		return xPos;
	}

	public void setxPos(double xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(double yPos) {
		this.yPos = yPos;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	
	public String move()
	{
		if (orientation == "north")
		{
			this.yPos = this.yPos + speed;
		}
		else if (orientation == "south")
		{
			this.yPos = this.yPos - speed;
		}
		else if (orientation == "east")
		{
			this.xPos = this.xPos + speed;
		}
		else 
		{
			this.xPos = this.xPos - speed;
		}
		
		return "This " + this.name + " moved to " + "(" + this.xPos + "," + this.yPos + ").";
	}
	
	public String toString()
	{
		return "Name: " + name + "; Position: (" + xPos + ", " + yPos + "); Orientation: "
				+ orientation + "; Speed: " + speed + ".";
					
	}
	public double distance(Robot other)
	{
		
		double x = Math.pow((other.getxPos() - this.getxPos()),2);
		double y = Math.pow((other.getyPos() - this.getyPos()),2);
		double howFar = Math.sqrt(x+y);
		return howFar;
	}
}
