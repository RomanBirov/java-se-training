package proc.task_26_Max3;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Max3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число А");
        int a = sc.nextInt();
        System.out.println("Введите число Б");
        int b = sc.nextInt();
        System.out.println("Введите число С");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println(" Числа А, Б и С равны между собой");
        }
        if (a < b){
            if (c > b) {
                System.out.println(" Число С больше числа А и Б");
            }
            if (b > c){
                System.out.println(" Число А больше числа Б и С");
            }
        }
        if (b < a) {
            if (c > a) {
                System.out.println(" Число С больше числа А и Б");
            }
            if (a > c){
                System.out.println(" Число Б больше числа А и С");
            }
        }
        if (a == b){
            if (c > a){
                System.out.println(" Число С больше числа А и Б");
            }
            if (c < a) {
                System.out.println(" Число А и Б равны между собой и больше числа С");
            }
        }
        else {
            System.out.println("Ты налажал с кодом");
        }
    }
}
