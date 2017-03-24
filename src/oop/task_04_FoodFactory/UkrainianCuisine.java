package oop.task_04_FoodFactory;

import java.util.Scanner;

/**
 * Created by Роман on 24.03.2017.
 */
public class UkrainianCuisine implements FoodFactory {
    @Override
    public Meal createMeal() {
        System.out.println("Please choose meal" + "\n" + "1 - Borscht " + "\n" + "2 - Vareniki");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Meal meal = null;
        if (a == 1) {meal = new Borscht ("Good ukranian borscht...");}
        if (a == 2) {meal =  new Vareniki("Wonderful vareniki with meat");}
        else {
            System.out.println("You did not choose meal");
        }
        return meal;
    }
}
