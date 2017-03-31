package oop.task_01_1_Figures;

/**
 * Created by Роман on 18.03.2017.
 */
public class Circle {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public String toString() {
        return "Circle " + getRadius() + " px ";
    }
    public String area(){
        String ar;
        double s = getRadius() * getRadius() * Math.PI;
        ar = "Area: " + Double.toString(s) + " px ";
        return ar;
    }
}
