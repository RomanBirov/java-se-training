package oop.task_04_FoodFactory;

import java.util.Scanner;

/**
 * Created by Роман on 24.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        FoodFactory factory;
        factory = getAppropriateFoodIFactory();
        Meal meal = factory.createMeal();
        showMeal(meal);
    }

    public static void showMeal(Meal meal) {
        System.out.println(meal.getFood());
    }


    public static FoodFactory getAppropriateFoodIFactory() {
        System.out.println("Please choose cuisine" + "\n" + "1 - Ukranian cuisine " + "\n" + "2 - Japanese cuisine");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        FoodFactory factory = null;
        if (i == 1) {
            factory = new UkrainianCuisine();
            return factory;
        }
        if (i == 2) {
            factory = new JapaneseCuisine();
            return factory;
        } else {
            System.out.println("You did not choose cuisine");
        }
        return factory;
    }
}




