package encapsule.learn;

public class Encapsulation {

	private int rollNumber=10;
	private String department;
	private int age;
	private static String collegeName;
	
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Encapsulation.collegeName = collegeName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
