package proc.task_20_WWS2;

/**
 * Created by Роман on 30.03.2017.
 */
public class WWS2 {
        public static void main(String[] args) {
            String S = "123456789abcdefghi";
            System.out.println(S);
            System.out.println("String length: " + S.length());
            System.out.println(S.substring(6, 12) + S.substring(12)  + S.substring(0,6));
            System.out.println(S.substring(6, 12) + S.substring(0,6) + S.substring(12));
        }
}
