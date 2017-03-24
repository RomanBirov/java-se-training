package proc.task_36_do_Whiledemo2;

import java.util.Scanner;

/**
 * Created by Роман on 23.03.2017.
 */
public class Whiledemo2_2 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a + " = " + b);
        }
        if (a != Math.min(a, b)) {
            while (a != b - 1) {
                a--;
                if (a % 3 == 0){
                    System.out.print(a + " ");
                }
            }
        } else {
            while (a != b + 1) {
                a++;
                if (a % 3 == 0){
                    System.out.print(a + " ");
                }

            }
        }
    }
}
