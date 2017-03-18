package proc.task_14_Lohica;

/**
 * Created by Роман on 18.03.2017.
 */
public class Lohica {
    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = false;
        c = false;
        System.out.println(a || b);
        System.out.println(a && b);
        System.out.println(b && c);
        System.out.println(!a && b);
        System.out.println(a || !b);
        System.out.println(a || b && c);
        System.out.println(a || (! (b && c)));
    }
}
