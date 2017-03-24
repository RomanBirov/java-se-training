package oop.task_04_FoodFactory;

/**
 * Created by Роман on 24.03.2017.
 */
public class Vareniki implements Meal {
    private String food;
    public Vareniki(String food) {this.food = food;}
    @Override
    public String getFood() {return food;}
}
