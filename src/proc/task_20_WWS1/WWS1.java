package proc.task_20_WWS1;

import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class WWS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String S =sc.nextLine();
        System.out.println(S.replaceAll(" " , "\t"));
        System.out.print("String length: " + S.length() + "\n");
        System.out.println("Enter number K");
        char c[] = S.toCharArray();
        int K = sc.nextInt();
        char first = c[0];
        c[0] = c[K];
        c[K] = first;
        S = new String(c);
        System.out.println(S);
    }
}
