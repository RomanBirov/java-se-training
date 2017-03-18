package proc.task_16_ArithmeticAverage5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class ArithmeticAverage5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number x1 more than -3 and less 1012");
        int x1 = sc.nextInt();
        System.out.println("Enter number x2 more than -3 and less 1012");
        int x2 = sc.nextInt();
        System.out.println("Enter number x3 more than -3 and less 1012");
        int x3 = sc.nextInt();
        System.out.println("Enter number x4 more than -3 and less 1012");
        int x4 = sc.nextInt();
        System.out.println("Enter number x5 more than -3 and less 1012");
        int x5 = sc.nextInt();
        int nums [] = {x1, x2, x3, x4, x5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(new int[]{nums[i]}));
        }
        double result = (x1 + x2 + x3 + x4 + x5) / 5;
        if ( -3 <= x1 && x1 >= 1012) {
            System.out.println("Numbers x1 less than -3 or more 1012"); }
        if ( -3 <= x4 && x2 >= 1012) {
            System.out.println("Numbers x2 less than -3 or more 1012"); }
        if ( -3 <= x3 && x3 >= 1012) {
            System.out.println("Numbers x3 less than -3 or more 1012"); }
        if ( -3 <= x4 && x4 >= 1012) {
            System.out.println("Numbers x4 less than -3 or more 1012"); }

        System.out.println("Average number  of the array " + result);

    }
}
