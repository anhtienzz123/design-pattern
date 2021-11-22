package decorator.pizza;

public class ChickenPizza implements Pizza {

	@Override
	public String doPizza() {
		return "I am a Chicken Pizza";
	}
}
