package proc.task_29_Proximal;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Proximal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки А");
        int a = sc.nextInt();
        System.out.println("Введите координаты точки Б");
        int b = sc.nextInt();
        System.out.println("Введите координаты точки С");
        int c = sc.nextInt();
        int r = (int) Math.random();
        if (r != 1){
            c = c + 6;
            double n = Math.abs(c-a);
            double m = Math.abs(c-b);
            System.out.println(c);
            if (m == n){
                System.out.println("Точка С равно удалена от точек А и Б");
            }
            if (m < n) {
                System.out.println("Точка С ближе к точке Б");
            }
            if (m > n) {
                System.out.println("Точка С ближе к точке А");
            }
        }
        else {
            c = c -6;
            double n = Math.abs(c-a);
            double m = Math.abs(c-b);
            System.out.println(c);
            if (m == n){
                System.out.println("Точка С равно удалена от точек А и Б");
            }
            if (m < n) {
                System.out.println("Точка С ближе к точке Б");
            }
            if (m > n) {
                System.out.println("Точка С ближе к точке А");
            }
        }
    }
}
