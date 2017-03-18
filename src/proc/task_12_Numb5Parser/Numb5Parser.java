package proc.task_12_Numb5Parser;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Numb5Parser {

    public static void main(String[] args) {
        int x, x1, x2, x3, x4, x5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        x = sc.nextInt();
        x5 = x % 10;
        x = x / 10;
        x4 = x % 10;
        x = x / 10;
        x3 = x % 10;
        x = x / 10;
        x2 = x % 10;
        x = x / 10;
        x1 = x % 10;
        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);
    }
}
