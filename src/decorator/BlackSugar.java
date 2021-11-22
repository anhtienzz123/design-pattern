package decorator;

public class BlackSugar extends MilkTeaDecorator {

	protected BlackSugar(IMilkTea inner) {
		super(inner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {

		return 2 + super.getCost();
	}
}
