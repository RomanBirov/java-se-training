package proc.task_10_Intsqr;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Intsqr {
    public static void main(String[] args) {
        double a;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println(Math.pow(a, 2));
    }
}
