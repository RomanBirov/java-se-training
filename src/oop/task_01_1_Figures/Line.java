package oop.task_01_1_Figures;

/**
 * Created by Роман on 31.03.2017.
 */
public class Line {

    private final double x, y;

    Line (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;}

    public double getY(){
        return this.y;}

    public String toString() {
        return "Line " + (getY() - getX()) + " px ";
    }

    public String pseudodraw() {
        String d = "***** ";
        return d;
    }

}
