package CreationalDesignPattern.BuilderPizza;

import CreationalDesignPattern.Builder.Computer;

public class Pizza {

    private String pizzaCrust ;
    private String cheese;

    private boolean ExtraCheese;
    private boolean pepperoni;
    private boolean olive;

    public String getPizzaCrust(){
        return pizzaCrust;
    }

    public String getCheese()
    {
        return cheese;
    }

    public boolean ExtraCheese() {
        return ExtraCheese;
    }
    public boolean Pepperoni() {
        return pepperoni;
    }
    public boolean Olive() {
        return olive;
    }

    private Pizza (PizzaBuilder builder){
        this.pizzaCrust = builder.pizzaCrust;
        this.cheese = builder.cheese;
        this.ExtraCheese = builder.ExtraCheese;
        this.pepperoni =builder.pepperoni;
        this.olive=builder.olive;

    }

    public static class PizzaBuilder{

        private String pizzaCrust ;
        private String cheese;

        private boolean ExtraCheese;
        private boolean pepperoni;
        private boolean olive;

        public PizzaBuilder(String pizzaCrust,String cheese){
            this.pizzaCrust=pizzaCrust;
            this.cheese=cheese;

        }
        public PizzaBuilder setExtraCheese(boolean ExtraCheese) {
            this.ExtraCheese = ExtraCheese;
            return this;
        }
        public PizzaBuilder setOlive(boolean olive) {
            this.olive = olive;
            return this;
        }

        public PizzaBuilder setPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }


        public Pizza build ()
        {
            return new Pizza(this);
        }
    }
}
