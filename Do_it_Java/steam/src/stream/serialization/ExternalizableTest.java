package stream.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Dog implements Externalizable {
    String name;

    public Dog() {}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
    }

    public String toString() {
        return name;
    }
}

public class ExternalizableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog();
        dog.name = "멍멍이";

        FileOutputStream fileOutputStream = new FileOutputStream("./inOutFile/external.out");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        try(fileOutputStream; objectOutputStream) {
            objectOutputStream.writeObject(dog);
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        FileInputStream fileInputStream = new FileInputStream("./inOutFile/external.out");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Dog myDog = (Dog) objectInputStream.readObject();
        System.out.println(myDog);
    }
}
