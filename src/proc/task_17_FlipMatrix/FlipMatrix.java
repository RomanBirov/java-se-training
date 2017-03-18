package proc.task_17_FlipMatrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class FlipMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number x1  more 10  and less 99");
        int x1 = sc.nextInt();
        System.out.println("Enter number x2  more 10  and less 99");
        int x2 = sc.nextInt();
        System.out.println("Enter number x3  more 10  and less 99");
        int x3 = sc.nextInt();
        System.out.println("Enter number x4  more 10  and less 99");
        int x4 = sc.nextInt();
        System.out.println("Enter number x5  more 10  and less 99");
        int x5 = sc.nextInt();
        System.out.println("Enter number x6  more 10  and less 99");
        int x6 = sc.nextInt();
        System.out.println("Enter number x7  more 10  and less 99");
        int x7 = sc.nextInt();
        System.out.println("Enter number x8  more 10  and less 99");
        int x8 = sc.nextInt();
        System.out.println("Enter number x9  more 10  and less 99");
        int x9 = sc.nextInt();
        System.out.println("Enter number x10  more 10  and less 99");
        int x10 = sc.nextInt();
        System.out.println("Enter number x11  more 10  and less 99");
        int x11 = sc.nextInt();
        System.out.println("Enter number x12  more 10  and less 99");
        int x12 = sc.nextInt();
        System.out.println("Enter number x13  more 10  and less 99");
        int x13 = sc.nextInt();
        System.out.println("Enter number x14  more 10  and less 99");
        int x14 = sc.nextInt();
        System.out.println("Enter number x15  more 10  and less 99");
        int x15 = sc.nextInt();
        System.out.println("Enter number x16  more 10  and less 99");
        int x16 = sc.nextInt();

        int[][] nums = new int[][]{
                new int[]{x1, x2, x3, x4},
                new int[]{x5, x6, x7, x8},
                new int[]{x9, x10, x11, x12},
                new int[]{x13, x14, x15, x16}
        };

        if (x1 < 10 && x1 > 99 &&
                x2 < 10 && x2 > 99 &&
                x3 < 10 && x3 > 99 &&
                x4 < 10 && x4 > 99 &&
                x5 < 10 && x5 > 99 &&
                x6 < 10 && x6 > 99 &&
                x7 < 10 && x7 > 99 &&
                x8 < 10 && x8 > 99 &&
                x9 < 10 && x9 > 99 &&
                x10 < 10 && x10 > 99 &&
                x11 < 10 && x11 > 99 &&
                x12 < 10 && x12 > 99 &&
                x13 < 10 && x13 > 99 &&
                x14 < 10 && x14 > 99 &&
                x15 < 10 && x15 > 99 &&
                x16 < 10 && x16 > 99 ) {

            System.out.println("One of numbers less than 10 or more 99");
        }

        else {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(Arrays.toString(nums[i]));
            }
        }
    }
}
