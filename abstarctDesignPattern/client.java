package abstarctDesignPattern;

public class client {
    public static void main(String[] args){
       BbqPizza bbqPizza = new BbqPizza();
       bbqPizza.addTopping("Chicken",100);
       bbqPizza.addTopping("Mashrom",120);
       System.out.println("Cost of bbq pizza : " +bbqPizza.totalCost() + "Tk");

       CheesePizza cheesePizza = new CheesePizza();
       cheesePizza.addTopping("Olives",80);
       cheesePizza.addTopping("pepperoni",50);
       System.out.println("Cost of cheese pizza : " +bbqPizza.totalCost() + "Tk");
    }
}
