package proc.task_32_Palindrome;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        int Number, Temp, Reminder, Reverse;
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);

        System.out.println("Введите число для проверки на палиндромом ");
        Number = sc.nextInt();
        Temp = Number;
        for(Reverse = 0; Temp > 0; Temp = Temp/10) {
            Reminder = Temp %10;
            Reverse = Reverse * 10 + Reminder;
        }
        System.out.println("Число наоборот = " + Reverse + "\n");
        if(Number == Reverse) {
            System.out.println(Number + " это число является палиндромом");
        }
        else  {
            System.out.println(Number + " это число не является палиндромом");
        }
    }
}
