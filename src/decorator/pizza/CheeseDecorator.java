package decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = this.pizza.doPizza();
        return type + addCheese();
    }

    private String addCheese() {
        return "+ Cheese";
    }
}
