package oop.task_01_2_CanvasFigures;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.canvas.Canvas;

import javafx.scene.canvas.GraphicsContext;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**

 * Created by codefire on 01.04.17.

 */

public class CanvasFigures extends Application {

    @Override

    public void start(Stage stage) throws Exception {

        System.out.println("noHello");

        Point p1 = new Point(5);

        Line l1 = new Line(10,50);

        Rectangle r1 = new Rectangle(100, 120);
        Rectangle r2 = new Rectangle(80, 140);

        Circle c1 = new Circle(60);
        Circle c2 = new Circle(80);
        Circle c3 = new Circle(100);

        Triangle t1 = new Triangle(40, 60, 80);
        Triangle t2 = new Triangle(50, 100, 150);

        Oval o1 = new Oval(30, 80);

        Polygon pol1 = new Polygon(6, 100);

        System.out.println(p1.toString());
        System.out.println(l1.toString());
        System.out.println(r1.toString() + r1.area());
        System.out.println(r2.toString() + r2.area());
        System.out.println(c1.toString() + c1.area());
        System.out.println(c2.toString() + c2.area());
        System.out.println(c3.toString() + c3.area());
        System.out.println(t1.toString() + t1.area());
        System.out.println(t2.toString() + t2.area());
        System.out.println(o1.toString() + o1.area());
        System.out.println(pol1.toString() + pol1.area());





        Pane pane = new Pane();

        Canvas canvas = new Canvas(500, 500);

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, (event) -> {

            GraphicsContext gc = canvas.getGraphicsContext2D();

            p1.draw(gc);
            l1.draw(gc);
            r1.draw(gc);
            r2.draw(gc);
            c1.draw(gc);
            c2.draw(gc);
            c3.draw(gc);
            t1.draw(gc);
            t2.draw(gc);
            o1.draw(gc);
            pol1.draw(gc);


        });

        GraphicsContext gc = canvas.getGraphicsContext2D();

        p1.draw(gc);
        l1.draw(gc);
        r1.draw(gc);
        r2.draw(gc);
        c1.draw(gc);
        c2.draw(gc);
        c3.draw(gc);
        t1.draw(gc);
        t2.draw(gc);
        o1.draw(gc);
        pol1.draw(gc);


       /*gc.moveTo(10, 10);

       gc.lineTo(100, 200);*/

        pane.getChildren().add(canvas);

        Scene value = new Scene(pane);

        //pane.setBackground();

        stage.setScene(value);

        stage.setTitle("Figures Pictures");

        stage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}


class Point {
    private final int n;
    Point (int n) {
        this.n = n;
    }

    public double getN(){
        return this.n;
    }

    public String toString() {
        return "Point " + getN() + " px ";
    }

    void draw(GraphicsContext gc) {

        gc.setStroke(Color.BLACK);

        gc.setLineWidth(3);

        gc.strokeLine(getN(), getN(), getN(), getN());
    }

}





class Line {

    private final double x, y;

    Line(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String toString() {
        return "Line " + (getY() - getX()) + " px ";
    }

    void draw(GraphicsContext gc) {

        gc.setStroke(Color.RED);

        gc.setLineWidth(3);

        gc.strokeLine(getX(), getX(), getY(), getY());
    }
}

    class Rectangle {
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

        void draw(GraphicsContext gc) {

            gc.setStroke(Color.BLUE);

            gc.setLineWidth(3);

            gc.strokeRect(getHeight(), getHeight(), getWight(), getWight());
        }

    }

class Circle {
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
    void draw(GraphicsContext gc) {

        gc.setStroke(Color.GOLD);

        gc.setLineWidth(3);

        gc.strokeOval(getRadius(), getRadius(), getRadius(), getRadius());
    }
}

class Triangle {

    private final double side1, side2, side3;

    Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return this.side1;}

    public double getSide2(){
        return this.side2;}

    public double getSide3(){
        return this.side3;}


    public String toString() {
        return "Triangle " + getSide1() + " x " + getSide2() + " x " + getSide3() + " px ";
    }

    public String area(){
        String ar;
        double p = (getSide1() + getSide2() + getSide3())/2;
        double s =Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
        ar = "Area: " +  Double.toString(s) + " px ";
        return ar;
    }

    void draw(GraphicsContext gc) {

        gc.setStroke(Color.GREENYELLOW);

        gc.setLineWidth(3);

        gc.strokeLine(getSide1(), getSide1(), getSide1(), getSide2());
        gc.strokeLine(getSide1(), getSide2(), getSide2(), getSide3());
        gc.strokeLine(getSide2(), getSide3(), getSide1(), getSide1());
    }
}



class Oval {


    private final double axle1, axle2;

    Oval (double axle1, double axle2) {
        this.axle1 = axle1;
        this.axle2 = axle2;
    }

    public double getAxle1(){
        return this.axle1;}

    public double getAxle2(){
        return this.axle2;}

    public String toString() {
        return "Oval " + getAxle1() + " x " + getAxle2() +  " px ";
    }

    public String area(){
        String ar;
        double s =Math.PI * getAxle1() * getAxle2();
        ar = "Area: " +  Double.toString(s) + " px ";
        return ar;
    }
    void draw(GraphicsContext gc) {

        gc.setStroke(Color.BROWN);

        gc.setLineWidth(3);

        gc.strokeOval(getAxle1(), getAxle2(), getAxle1(), getAxle2());
    }
}

class Polygon {

    private final int numbsides;
    private final int side;

    Polygon(int numbsides, int side) {
        this.numbsides = numbsides;
        this.side = side;
    }

    public int getNumbsides(){
        return this.numbsides;}

    public int getSide(){
        return this.side;}


    public String area() {
        String ar;
        int s = (int) ((getNumbsides() * (getSide() * getSide())) / (4 * (Math.tan(Math.PI/getNumbsides()))));
        ar = "Area: " +  Integer.toString(s) + " px ";
        return ar;
    }



    public String toString() {
        return "Poligon " + getNumbsides() + " * " + getSide() + " px ";
    }

    void draw(GraphicsContext gc) {

        gc.setStroke(Color.RED);

        gc.setLineWidth(5);

        gc.strokePolygon(new double[getSide()], new double [getSide()], getNumbsides());
    }
}



