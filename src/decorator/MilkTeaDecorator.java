package decorator;

public class MilkTeaDecorator implements IMilkTea {

	private IMilkTea milkTea;

	protected MilkTeaDecorator(IMilkTea inner) {
		milkTea = inner;
	}
	
	@Override
	public double getCost() {
		return milkTea.getCost();
	}
}
