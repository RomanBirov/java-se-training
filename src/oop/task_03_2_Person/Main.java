package oop.task_03_2_Person;

import java.util.Arrays;

/**
 * Created by Роман on 20.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Person [] myfriends = {
                new Person(22, "Stas"),
                new Person(30, "Aleksandr"),
                new Person(24, "Vika"),
                new Person(18, "Igor"),
                new Person(20, "Victor"),
        };
        Arrays.sort(myfriends, new HumanAgeAscendingComparator ());

        for (Person p : myfriends) {
            System.out.println("Person: Age " + p.getAge() + " Name " + p.getName());
        }
        System.out.println("\n");

                Arrays.sort(myfriends, new HumanNameDescendingComparator());
        //String line = Arrays.toString(myfriends);
        //System.out.println(line);
        for (Person p : myfriends) {
            System.out.println("Person: Age " + p.getAge() + " Name " + p.getName());
        }
    }
}
