package oop.task_04_FoodFactory;

import java.util.Scanner;

/**
 * Created by Роман on 24.03.2017.
 */
public class JapaneseCuisine implements FoodFactory {
    @Override
    public Meal createMeal() {
        System.out.println("Please choose meal" + "\n" + "1 - MisoSoup " + "\n" + "2 - Sushi");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Meal meal = null;
        if (b == 1) {
            meal = new MisoSoup("Tasty miso sup with Shrimps");
        }
        if (b == 2) {
            meal = new Sushi("Nice sushi with fish");
        } else {
            System.out.println("You did not choose meal");
        }
        return meal;
    }
}
