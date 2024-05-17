package CreationalDesignPattern.BuilderPizza;

public class client {
    public static void main(String[] args){
        Pizza pizza = new Pizza.PizzaBuilder("large","mozarella").setExtraCheese(true).setPepperoni(true).build();
    }
}
