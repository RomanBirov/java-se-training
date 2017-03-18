package oop.task_01_Figures;

/**
 * Created by Роман on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Rectangle r1 = new Rectangle(10, 12);
        Rectangle r2 = new Rectangle(8, 14);

        Circle c1 = new Circle(6);
        Circle c2 = new Circle(8);
        Circle c3 = new Circle(10);

        Triangle t1 = new Triangle (4, 6, 8);
        Triangle t2 = new Triangle (5, 10, 15);

        System.out.println(r1.toString() + r1.area());
        System.out.println(r2.toString() + r2.area());
        System.out.println(c1.toString() + c1.area());
        System.out.println(c2.toString() + c2.area());
        System.out.println(c3.toString() + c3.area());
        System.out.println(t1.toString() + t1.area());
        System.out.println(t2.toString() + t2.area());

    }
}
