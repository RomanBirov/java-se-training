package proc.task_27_Min4;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Min4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Введите третье число");
        int c = sc.nextInt();
        System.out.println("Введите четвертое число");
        int d = sc.nextInt();
        System.out.println("Минимальное число " + Math.min(a,Math.min(b, Math.min(c,d))));
    }
}
