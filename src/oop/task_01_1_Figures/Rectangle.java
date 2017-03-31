package oop.task_01_1_Figures;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Роман on 18.03.2017.
 */
public class Rectangle {
    private final double width, height;

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
        ar = "Area: " + Double.toString(s) + " px ";
        return ar;
    }


    public String toString() {
        return "Rectangle " + getWight() + " x " + getHeight() + " px ";
    }


    private void draw(GraphicsContext gc) {

        double canvasWidth = gc.getCanvas().getWidth();
        double canvasHeight = gc.getCanvas().getHeight();


        gc.setLineWidth(5);

        gc.fill();
        gc.strokeRect(
                0,              //x of the upper left corner
                0,              //y of the upper left corner
                canvasWidth,    //width of the rectangle
                canvasHeight);  //height of the rectangle

        gc.setLineWidth(1);
    }
}