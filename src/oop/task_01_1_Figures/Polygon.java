package oop.task_01_1_Figures;

/**
 * Created by Роман on 31.03.2017.
 */
public class Polygon {

    private final int numbsides;
    private final double side;

    Polygon(int numbsides, double side) {
        this.numbsides = numbsides;
        this.side = side;
    }

    public double getNumbsides(){
        return this.numbsides;}

    public double getSide(){
        return this.side;}


    public String area() {
        String ar;
        double s = (getNumbsides() * (getSide() * getSide())) / (4 * (Math.tan(Math.PI/getNumbsides())));
        ar = "Area: " +  Double.toString(s) + " px ";
        return ar;
    }



    public String toString() {
        return "Poligon " + getNumbsides() + " * " + getSide() + " px ";
    }
}

