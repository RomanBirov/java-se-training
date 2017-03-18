package proc.task_33_QuadraticEquation;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        double a, b, c, d;
        System.out.println("The program solves a quadratic equation of the form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a, b, c:");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("The roots of equation: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("The equation has a single root: x = " + x);
        }
        else {
            System.out.println("The equation has no real roots!");
        }
    }
}
