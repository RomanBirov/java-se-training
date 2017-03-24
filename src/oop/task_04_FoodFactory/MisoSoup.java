package oop.task_04_FoodFactory;

/**
 * Created by Роман on 24.03.2017.
 */
public class MisoSoup implements Meal {
    private String food;
    public MisoSoup(String food) {this.food = food;}
    @Override
    public String getFood() {return food;}
}
