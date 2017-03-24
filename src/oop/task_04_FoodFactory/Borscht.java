package oop.task_04_FoodFactory;

/**
 * Created by Роман on 24.03.2017.
 */
public class Borscht implements Meal {
    private String food;
    public Borscht(String food) {this.food = food;}
    @Override
    public String getFood() {return food;}

}
