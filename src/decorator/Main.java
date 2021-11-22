package decorator;

public class Main {

	public static void main(String[] args) {
		double firstMilkTea = new EggPudding(new BlackSugar(new MilkTea())).getCost();
		System.out.println("firstMilkTeaCost: " + firstMilkTea);
	}
}
