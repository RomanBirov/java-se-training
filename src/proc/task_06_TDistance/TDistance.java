package proc.task_06_TDistance;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class TDistance {

    public static void main(String[] args) {
        int v1 = 50;
        int v2 = 30;
        int s = 80;
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double s1 = s + (v1+v2)*t;
        System.out.println(s1);
    }
}
