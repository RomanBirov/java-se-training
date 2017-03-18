package proc.task_25_Max2;

import java.util.Scanner;

/**
 * Created by Роман on 18.03.2017.
 */
public class Max2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x != y) {
            if (x > y){
                System.out.println("Number x more than y");
            }
            if (x < y){
                System.out.println("Number y more than x");
            }
        }
        else {
            System.out.println("Number y equally x");
        }
    }
}
