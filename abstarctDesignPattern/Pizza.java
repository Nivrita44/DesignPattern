package abstarctDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

abstract class Pizza {
    public int baseCost = 100;

    Map <String, Integer> toppings;

    public Pizza(){
        toppings = new HashMap<>();
    }
    public void addTopping(String topping,int cost) {
        toppings.put(topping,cost);
    }

    public abstract double totalCost();





}
