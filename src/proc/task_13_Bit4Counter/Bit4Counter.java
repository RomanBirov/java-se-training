package proc.task_13_Bit4Counter;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Bit4Counter {
    public static void main(String[] args) {
        int n,  count = 0;
        System.out.println("Enter number < 16");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n !=0){
            count += n & 1;
            n = n >>> 1;}
        System.out.println(count);
    }
}
