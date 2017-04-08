package oop.task_BusyTread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Роман on 08.04.2017.
 */
public class Main {

    public static void main(String[] args)  throws InterruptedException {
        long expectedExecutionTime = MyThread.ITERATION_COUNT * Producer.DELAY_IN_MILLIS;
        long actualExecutionTime = System.currentTimeMillis();
        MyThread thread = new MyThread(new Producer(), new Consumer());
        thread.start();
        long halftime = expectedExecutionTime / 2;
        Thread.sleep(halftime);
        //thread.interrupt();
        // thread.stop();


        thread.join();
        actualExecutionTime = System.currentTimeMillis() - actualExecutionTime;
        System.out.println("expected execution time = " + expectedExecutionTime);
        System.out.println("actual execution time = " + actualExecutionTime);
    }
}


class MyThread extends Thread {
    public  static final int ITERATION_COUNT = 100;
    private Producer producer;
    private Consumer consumer;

    public MyThread (Producer producer, Consumer consumer) {
        this.producer = producer;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        int i;

        System.out.println("----MyThread started----");
        for ( i = 0; i < ITERATION_COUNT ; i++) {
            int num = producer.produce();
            consumer.consume(num);
            if (ThreadStopper.shouldStop() == true) {

                break;
            }
        }

        System.out.println(i);

        System.out.println("----MyThread stopped----");
    }
}

class  Producer {
    public static  final  int DELAY_IN_MILLIS = 100;
    private Random random = new Random();

    public int produce () {
        try {
            Thread.sleep(DELAY_IN_MILLIS);
        } catch (InterruptedException e) {}
        return random.nextInt(100);
    }
}

class Consumer {
    private static final int MAX_SIZE = 10000;
    private List<Integer> list = new ArrayList<>();

    public void consume (int number) {
        list.add(number);
        if (list.size() > MAX_SIZE) {
            list.clear();
        }
    }
}

class ThreadStopper {

    public static boolean shouldStop()  {
        boolean result;
        result = Math.random() > (6/7);
        return result;

    }
}
