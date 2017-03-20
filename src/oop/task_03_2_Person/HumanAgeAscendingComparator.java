package oop.task_03_2_Person;

/**
 * Created by Роман on 20.03.2017.
 */
public class HumanAgeAscendingComparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person etot = (Person) o1;
        Person drugoy = (Person) o2;

        if(((Person) o1).getAge() < ((Person) o2).getAge())
        {return -1;}

        if (((Person) o1).getAge() > ((Person) o2).getAge())
        {return 1;}

        else
            return 0;
    }

}
