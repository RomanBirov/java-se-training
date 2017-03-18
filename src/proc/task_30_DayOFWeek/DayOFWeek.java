package proc.task_30_DayOFWeek;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class DayOFWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("Понедельник");
        }
        if (a == 2){
            System.out.println("Вторник");
        }
        if (a == 3){
            System.out.println("Среда");
        }
        if (a == 4){
            System.out.println("Четверг");
        }
        if (a == 5){
            System.out.println("Пятница");
        }
        if (a == 6){
            System.out.println("Суббота");
        }
        if (a == 7){
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("Нет таких дней");
        }
    }
}
