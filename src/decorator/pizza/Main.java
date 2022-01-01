package decorator.pizza;

public class Main {

	public static void main(String[] args) {
		Pizza tomato = new TomatoPizza();
        Pizza chicken = new ChickenPizza();

//        System.out.println(tomato.doPizza());
//        System.out.println(chicken.doPizza());

//        Pizza tomato = new PepperDecorator(tomato);
//        System.out.println(pepperDecorator.doPizza());
//
//        Pizza cheeseDecorator = new CheeseDecorator(pepperDecorator);
//        System.out.println(cheeseDecorator.doPizza());
        tomato = new PepperDecorator(tomato);
        System.out.println(tomato.doPizza());

        tomato = new CheeseDecorator(tomato);
        System.out.println(tomato.doPizza());
        
//        CheeseDecorator cheeseDecorator2 = new CheeseDecorator(pepperDecorator);
//        System.out.println(cheeseDecorator2.doPizza());
	}
}
