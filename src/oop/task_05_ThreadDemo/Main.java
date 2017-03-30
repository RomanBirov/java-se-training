package oop.task_05_ThreadDemo;

/**
 * Created by Роман on 30.03.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread());;
        System.out.println("Start");
        Potok potok = new Potok();
        Thread thread = new Thread(potok);
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("End");
    }
}
class Potok implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread());


        for (int i = 10; i <= 20; i++) {

            try {
                System.out.println(i);
                Thread.sleep(1000);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Stop");
        return;

    }

}
