package oop.task_01_Figures;

/**
 * Created by Роман on 18.03.2017.
 */
public class Triangle {

    private double side1, side2, side3;

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
}
