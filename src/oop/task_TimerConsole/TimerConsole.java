package oop.task_TimerConsole;

import java.util.Scanner;

public class TimerConsole {

    public static void main(String[] args) throws InterruptedException {

        ThreadTimer threadtimer = new ThreadTimer();
        Thread thread = new Thread(threadtimer);
        thread.start();
        thread.join();
        System.out.println("Действие завершено");
    }
}

class ThreadTimer implements Runnable {

    @Override
    public void run() {

    String s1 = "Встретить Машу";
    String s2 = "Заказать пиццу";
    System.out.println("Напишите действие: ");
    Scanner sc = new Scanner(System.in);
    String s3 = sc.nextLine();

        if (s3.equals(s1)) {

            for (int i = 3750; i > 0; i--) {
                int hour = i / 3600;
                int minute = (i % 3600) / 60;
                int second = (i % 3600) % 60;

                try {
                    System.out.println("Часов: " + hour + "  " + "Минут:" + minute + "  " + "Секунд:" + second);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (s2.equals(s3)) {

            for (int i = 120; i > 0; i--) {
                int hour = i / 3600;
                int minute = (i % 3600) / 60;
                int second = (i % 3600) % 60;

                try {
                    System.out.println("Часов: " + hour + "  " + "Минут:" + minute + "  " + "Секунд:" + second);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}