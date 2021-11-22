package decorator.pizza;

public class TomatoPizza implements Pizza {

	@Override
	public String doPizza() {
		return "I am a Tomato Pizza";
	}
}