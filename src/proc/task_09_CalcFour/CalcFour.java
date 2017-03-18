package proc.task_09_CalcFour;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class CalcFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
