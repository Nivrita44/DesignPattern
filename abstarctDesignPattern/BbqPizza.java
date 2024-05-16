package abstarctDesignPattern;

public class BbqPizza extends Pizza{

    @Override
    public double totalCost() {
        int totalCost = baseCost;
        for (double cost : toppings.values()) {
            totalCost += cost;
        }
        return totalCost;
    }
}
