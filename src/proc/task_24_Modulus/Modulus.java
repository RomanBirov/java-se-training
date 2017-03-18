package proc.task_24_Modulus;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 != 0) {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}
