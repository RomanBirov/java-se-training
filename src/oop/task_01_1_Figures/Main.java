package oop.task_01_1_Figures;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Роман on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Point p1 = new Point(1);

        Line l1 = new Line(2, 6);

        Rectangle r1 = new Rectangle(10, 12);
        Rectangle r2 = new Rectangle(8, 14);

        Circle c1 = new Circle(6);
        Circle c2 = new Circle(8);
        Circle c3 = new Circle(10);

        Triangle t1 = new Triangle(4, 6, 8);
        Triangle t2 = new Triangle(5, 10, 15);

        Oval o1 = new Oval(3, 4);

        Polygon pol1 = new Polygon(6, 3);


        System.out.println(p1.pseudodraw() + p1.toString());
        System.out.println(l1.pseudodraw() + l1.toString());
        System.out.println(r1.toString() + r1.area());
        System.out.println(r2.toString() + r2.area());
        System.out.println(c1.toString() + c1.area());
        System.out.println(c2.toString() + c2.area());
        System.out.println(c3.toString() + c3.area());
        System.out.println(t1.toString() + t1.area());
        System.out.println(t2.toString() + t2.area());
        System.out.println(o1.toString() + o1.area());
        System.out.println(pol1.toString() + pol1.area());
    }
}
