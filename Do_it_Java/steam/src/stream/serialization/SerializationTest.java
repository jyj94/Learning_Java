package stream.serialization;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = -1503252402544036183L;
    String name;
    String job;
//    transient String job;

    public Person() {}
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String toString() {
        return name + " , " + job;
    }
}
public class SerializationTest {
    public static void main(String[] args) {
        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try(FileOutputStream fileOutputStream = new FileOutputStream("./inOutFile/serial.out")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(personAhn);
            objectOutputStream.writeObject(personKim);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        Person p1 = null, p2 = null;
        try(FileInputStream fileInputStream = new FileInputStream("./inOutFile/serial.out")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            p1 = (Person) objectInputStream.readObject();
            p2 = (Person) objectInputStream.readObject();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
