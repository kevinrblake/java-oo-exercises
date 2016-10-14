import java.util.ArrayList;

public class Course {
	
	private String name;
	private int credits;
	private int seatsRemaining;
	private ArrayList<Student> roster = new ArrayList<Student>();
	
	public Course(String name, int credits, int seatsRemaining) {
		this.name = name;
		this.credits = credits;
		this.seatsRemaining = seatsRemaining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getRemainingSeats() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public ArrayList<Student> getRoster() {
		return roster;
	}

		
	//not done
	public boolean addStudent(Student newStudent)
	{
		if (this.seatsRemaining <= 0)
		{
			return false;
		}
		for (int i = 0; i<this.roster.size(); i++)
		{
			Student compare = (Student) this.roster.get(i);
			
			if (newStudent.getName() == compare.getName())
			{
				return false;
			}
		} 
		this.roster.add(0, newStudent);
		this.seatsRemaining--;
		return true;
	}
	public String generateRoster()
	{
		String newRoster = "";
		for (int i = 0; i < this.roster.size(); i++)
		{
		    Student current = this.roster.get(i);
		    newRoster += current.toString() + "\t";
		}
		return newRoster;
	}
	public double averageGPA()
	{
		double avgGPA = 0.0;
		
		for (int i = 0; i < this.roster.size(); i++)
		{
			Student one = (Student)this.roster.get(i);
			avgGPA += one.getGPA();
		}
		avgGPA /= this.roster.size();
		return avgGPA;
	}

	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + "]";
	}
	
}
