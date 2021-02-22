package staticex;

public class StudentTest3 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("Mr Lee");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentName + " : " + studentLee.studentID);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("Mr Son");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " : " + studentSon.studentID);
		
	}
}
