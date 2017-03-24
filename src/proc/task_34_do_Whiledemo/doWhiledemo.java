package proc.task_34_do_Whiledemo;

import java.util.Scanner;

/**
 * Created by Роман on 23.03.2017.
 */
public class doWhiledemo {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a + " = " + b);
        }
        if (a >= b) {
            do {
                System.out.print(a + " ");
                a--;
            }
            while (a >= b);
    }

        else {
            do {
                System.out.print(a + " ");
                a++;
            }
            while (a <= b);
        }
    }
}
