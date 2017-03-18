package oop.task_02_Homezoo;

/**
 * Created by Роман on 18.03.2017.
 */
enum Master {
    ROMAN_BIROV,
    PHONE_NUMBER_0630565956;
}

enum Types {
    AMPHIBIA, NATATORIAL, FLYING;
}

public class Main {
    Types type;
    public static void main(String[] args) {
        System.out.println(Master.ROMAN_BIROV + " " + Master.PHONE_NUMBER_0630565956);
        Pet[] myPets = {
                new Dog(Types.NATATORIAL,20, 4, "Sharik"),
                new Cat(Types.NATATORIAL, 12, 4,  "Barsik"),
                new Parrot (Types.FLYING, 4, 2, "Kesha"),
        };
        for (Pet p : myPets) {
            System.out.printf("'%s' '%s' \n \t .weight = %d(kg) \n \t .legs = %d(legs) %n ",p.petType, p.getName(), p.getWeight(), p.getLegs());
        }
    }
}

class Animal {
    private int weight;
    public Animal (int weight) {
        this.weight = weight;}
    public int getWeight() {return weight;}
}

class Pet extends Animal {

    private String name;
    private int legs;
    Types petType;

    public Pet(Types type, int weight, int legs, String name) {
        super( weight);
        petType = type;
        this.name = name;
        this.legs = legs;
    }

    public String getName() {return name;}

    public int getLegs() {return legs;}
}

class Cat extends Pet {

    public Cat(Types type,int weight, int legs, String name) {
        super(type, weight, legs,  name);

    }

    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}

class Dog extends Pet {

    public Dog(Types type, int weight, int legs, String name) {
        super(type, weight, legs, name);
    }

    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }
}

class Parrot extends Pet {

    public Parrot(Types type, int weight, int legs, String name) {
        super(type, weight, legs, name);
    }

    public void flying(String command) {
        System.out.println("Flying ");
    }
}