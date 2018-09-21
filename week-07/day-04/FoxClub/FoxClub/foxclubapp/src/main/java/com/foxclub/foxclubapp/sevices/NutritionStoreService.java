package com.foxclub.foxclubapp.sevices;

import com.foxclub.foxclubapp.modells.Drink;
import com.foxclub.foxclubapp.modells.Food;
import org.springframework.stereotype.Service;

@Service
public class NutritionStoreService {
    private Drink drink = new Drink();
    private Food food = new Food();

    public String findDrink(String drinkName) {
        for (String drink : drink.getDrinks()) {
            if(drink.equals(drinkName)){
                return drink;
            }
        }
        return null;
    }

    public String findFood(String foodName) {
        for (String food : food.getFoods()) {
            if(food.equals(foodName)) {
                return food;
            }
        }
        return null;
    }

    public Drink getDrink() {
        return drink;
    }

    public Food getFood() {
        return food;
    }
}
