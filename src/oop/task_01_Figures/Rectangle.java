package oop.task_01_Figures;

/**
 * Created by Роман on 18.03.2017.
 */
public class Rectangle {
    private double width, height;

    public double getWight() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }


    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public String area() {
        String ar;
        double s = width * height;
        ar = "Area: " +  Double.toString(s) + " px ";
        return ar;
    }



    public String toString() {
        return "Rectangle " + getWight() + " x " + getHeight() + " px ";
    }
}
