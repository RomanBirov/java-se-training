package oop.task_03_Person;

/**
 * Created by Роман on 18.03.2017.
 */
public class Person  implements Comparable {
    private int age;
    private String name;
    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {return age;}
    public String getName() {return name;}

    @Override
    public int compareTo(Object o) {

        Person drugoy = (Person)o;


        if(this.getAge() < drugoy.getAge())
        {return -1;}

        if (this.getAge() > drugoy.getAge())
        {return 1;}

        else
            return 0;
    }
}