package classandobject;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(this.studentName + ", " + this.address);
	}
}
