package proc.task_11_Revers3Numb;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Revers3Numb {
    public static void main(String[] args) {
        int n, reverse = 0;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while( n != 0 )
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        System.out.println("Reverse of number "+reverse);
    }
}
