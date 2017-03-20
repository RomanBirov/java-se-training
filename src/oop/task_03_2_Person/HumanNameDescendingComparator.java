package oop.task_03_2_Person;

/**
 * Created by Роман on 20.03.2017.
 */
public class HumanNameDescendingComparator implements java.util.Comparator {

    @Override
    public int compare(Object a, Object b) {
        Person etot = (Person) a;
        Person drugoy = (Person) b;
        return ((Person) b).getName().compareTo(((Person) a).getName());

    }

}
