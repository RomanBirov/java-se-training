package proc.task_19_Gauge;

import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Gauge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string ");
        String S = s.nextLine();
        System.out.println("String length: "+S.length());

        char c[] = S.toCharArray();
        int last = c.length-1;
        char first = c[0];
        c[0] = c[last];
        c[last] = first;
        S = new String(c);
        System.out.println(S);

        if (S.length()%2==0) {
            System.out.println(true);
        }

        else {
            System.out.println(false);
        }

    }
}
