package proc.task_08_Concatinations;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Concatinations {

    public static void main(String[] args) {
        int s1, s2, s3;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        System.out.println(s1 + s3);
        System.out.println(s3 + s2 + s1);
        System.out.println(s1 + s2 + s3);
    }
}
