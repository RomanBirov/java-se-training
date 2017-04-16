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
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название события");
        String eventname = sc.nextLine();
        System.out.println("Введите длительность таймера часов/минут/секунд");
        int hourevent = sc.nextInt();
        int minutevent = sc.nextInt();
        int secondevent = sc.nextInt();
        int timeevent = hourevent * 3600 + minutevent * 60 + secondevent;

        for (int i = timeevent; i > 0; i--) {
            int hour = i / 3600;
            int minute = (i % 3600) / 60;
            int second = (i % 3600) % 60;

            try {
                System.out.println(eventname + " " + "Осталось Часов: " + hour + "  " + "Минут:" + minute + "  " + "Секунд:" + second);
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}