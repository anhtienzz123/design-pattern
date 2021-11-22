package decorator.pizza;

public class PepperDecorator extends PizzaDecorator {

    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String type = this.pizza.doPizza();
        return type + addPepper();
    }

    private String addPepper() {
        return "+ Pepper";
    }
}
