package proc.task_35_do_Whiledemo1;

import java.util.Scanner;

/**
 * Created by Роман on 23.03.2017.
 */
public class doWhiledemo1 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a + " = " + b);
        }
        if (a != Math.min(a, b)) {
            do {
                System.out.print(a + " ");
                a--;
            }
            while (a != b - 1);

        } else {
            do {
                System.out.print(a + " ");
                a++;
            }
            while (a != b + 1);
        }
    }
}
