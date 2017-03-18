package proc.task_15_Check;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter number x ");
        x = sc.nextInt();
        System.out.println("Enter number y ");
        y = sc.nextInt();
        boolean a;
        a = x * 3 - y * 2 <=0;
        System.out.println(a);
        a = (boolean) (! (x * y < 1)) && (y > x);
        System.out.println(a);
    }
}
