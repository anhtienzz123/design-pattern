package decorator;

public class EggPudding extends MilkTeaDecorator {

	protected EggPudding(IMilkTea inner) {
		super(inner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		
		return 1 + super.getCost();
	}
}
