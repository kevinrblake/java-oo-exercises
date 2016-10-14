
import java.text.DecimalFormat;

public class Student {

	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double GPA;
	private double qualityScore;
	DecimalFormat df = new DecimalFormat("#.###");
	
	public Student(String firstName, String lastName, int studentId) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentId;
		this.credits = 0;
		this.GPA = 0.0;
		this.qualityScore = 0;
		
	}
	public Student(String firstName, String lastName, int studentId, int credits, double GPA) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentId;
		this.credits = credits;
		this.GPA = GPA;
		this.qualityScore = 0;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getName()
	{
		String name = this.firstName + " " + this.lastName;
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentId) {
		this.studentID = studentId;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gpa) {
		this.GPA = gpa;
	}
	

	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentID=" + studentID + "]";
	}

public String getClassStanding()
{
	if (this.credits < 30)
	{
		return "Freshman";
	}
	else if (this.credits < 60)
	{
		return "Sophomore";
	}
	else if (this.credits < 90)
	{
		return "Junior";
	}
	else 
	{
		return "Senior";
	}
}
	public void submitGrade(double grade, int credit)
	{
		double qual = grade * credit;
		int newCredit = this.credits + credit;
		setCredits(newCredit);
		this.qualityScore += qual;
		String gpa = df.format(this.qualityScore / this.credits);
		double newGPA = Double.parseDouble(gpa);
		setGPA(newGPA);
	}
	public double computeTuition()
	{
		
		int numSemesters = this.credits/15;
		int leftOver = this.credits % 15;
		return (numSemesters * 20000.0 + leftOver * 1333.33);
		
//		df.setRoundingMode(RoundingMode.HALF_UP);
//		String tuition = df.format(1333.33 * this.getCredits());
//		double total = Double.parseDouble(tuition);
//		return total;
	}
	public Student createLegacy(Student a, Student b)
	{
		
		int stNum = a.getStudentID() + b.getStudentID();
		double gpa = (a.getGPA() + b.getGPA()) /2;
		int newCred;
		if (a.getCredits() > b.getCredits())
		{
			newCred = a.getCredits();
		}
		else
		{
			newCred = b.getCredits();
		}
		Student baby = new Student(a.getName(), b.getName(), stNum, newCred, gpa);
		
		return baby;
	}
	
	
	
	
	
}