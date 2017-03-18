package proc.task_28_Min5;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Min5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1");
        int a = sc.nextInt();
        System.out.println("Number 2");
        int b = sc.nextInt();
        System.out.println("Number 3");
        int c = sc.nextInt();
        System.out.println("Number 4");
        int d = sc.nextInt();
        System.out.println("Number 5");
        int e = sc.nextInt();
        System.out.println("Minimal number " + Math.min(a,Math.min(b,Math.min(c,Math.min(d,e)))));
    }
}
