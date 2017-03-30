package proc.task_21_WWS3;

import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class WWS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String S =sc.nextLine();
        System.out.println("Enter number K");
        int K =sc.nextInt();
        System.out.println(S.substring(K,S.length())+(S.substring(0, K)));
    }
}
