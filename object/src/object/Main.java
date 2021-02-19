package object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }
    @Override
    public String toString() {
        return bookTitle + ", " + bookNumber;
    }
}

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentName + ", " + studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student std = (Student)obj;
            if (studentName == std.studentName && studentId == std.studentId) return true;
            else return false;
        }
        else return false;
    }
    @Override
    public int hashCode() {
        return studentId;
    }
}

public class Main {
//    public static void main(String[] args) {
////        Test test = new Test();
////        System.out.println(test.toString());
////        Object test2 = test;
////        System.out.println(test2.toString());
////
////        System.out.println("------");
////        System.out.println(test.equals(test2));
////        System.out.println("test's hashcode : " + test.hashCode());
////        System.out.println("test2's hashcode : " + test2.hashCode());
////        System.out.println("------");
////        System.out.println("test's hashcode : " + test.getClass());
////        System.out.println("test2's hashcode : " + test2.getClass());
////        System.out.println("------");
////
////        System.out.println("test's hashcode : " + test.hashCode());
////        System.out.println("test2's hashcode : " + test2.hashCode());
////
////        Book book1 = new Book(200, "개미");
////
////        System.out.println(book1);
////        System.out.println(book1.toString());
////
//        Student studentLee = new Student(100, "Mr Lee");
//        Student studentLee2 = studentLee;
//        Student studentSang = new Student(100, "Mr Lee");
//////
////        System.out.println("studentLee == studentLee2 : " + studentLee.equals(studentLee2));
////        System.out.println("studentLee == studentSang : " + studentLee.equals(studentSang));
////        System.out.println("studentLee's value == studentLee2's value : " + (studentLee == studentLee2));
////        System.out.println("studentLee's value == studentSang's value : " + (studentLee == studentSang));
////        String str1 = new String("abc");
////        String str2 = new String("abc");
////        System.out.println(str1 == str2);
////        System.out.println(str1.equals(str2));
////        System.out.println(str1 + "'s hashcode : " + str1.hashCode());
////        System.out.println(str2 + "'s hashcode : " + str2.hashCode());
////        Integer i1 = new Integer(100);
////        Integer i2 = new Integer(100);
////
////        System.out.println(i1 == i2);
////        System.out.println(i1.equals(i2));
////        System.out.println(str1 + "'s hashcode : " + i1.hashCode());
////        System.out.println(str2 + "'s hashcode : " + i2.hashCode());
//
////        System.out.println("studentLee's hashCode : " + studentLee.hashCode());
////        System.out.println("studentSang's hashCode : " + studentSang.hashCode());
////
////        System.out.println("studentLee's memory address : " + System.identityHashCode(studentLee));
////        System.out.println("studentSang's memory address : " + System.identityHashCode(studentSang));
//
////        int a = new Integer(123);
////        int b = new Integer(123);
////        System.out.println(System.identityHashCode(a));
////        System.out.println(System.identityHashCode(b));
//    }
}
