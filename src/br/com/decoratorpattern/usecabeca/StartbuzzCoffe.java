package br.com.decoratorpattern.usecabeca;

public class StartbuzzCoffe {

	public static void main(String[] args) {
		
		Beverage beverage = new Expressso();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
	}

}
