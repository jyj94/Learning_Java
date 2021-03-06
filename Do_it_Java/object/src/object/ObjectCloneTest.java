package object;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
//Cloneable interface make class able to clone;
class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        this.radius = radius;
        point = new Point(x, y);
    }

    public String toString() {
        return "point is " + point + ", radius is " + radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle) circle.clone();
        System.out.println(circle.clone().getClass());
        System.out.println(circle);
        System.out.println(copyCircle);
        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle));
    }
}
