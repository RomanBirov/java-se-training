package oop.task_01_1_Figures;

/**
 * Created by Роман on 31.03.2017.
 */
public class Oval {


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
}
