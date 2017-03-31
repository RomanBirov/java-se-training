package oop.task_01_1_Figures;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Роман on 31.03.2017.
 */
public class Point {
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

    public String pseudodraw() {
        String d = "* ";
        return d;
    }
}
