package proc.task_18_Like;

import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Like {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string X");
        String x = sc. nextLine();
        System.out.println("Enter string Y");
        String y = sc. nextLine();
        String result = "I like " + x + " because of " + y;
        System.out.println(result);
    }
}