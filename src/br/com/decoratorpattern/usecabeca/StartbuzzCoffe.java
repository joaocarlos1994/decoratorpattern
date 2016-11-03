package br.com.decoratorpattern.usecabeca;

/**
 * Os decoradores no caso (Soy, Mocha, Whip) devem ter o mesmo tipo que os
 * objetos que eles irao decorar (Component).
 * 
 * Assim quando compomos um decorador com um componente, estamos adicionando um
 * novo comportamento.
 * 
 * 
 * Principio de projeto As classes devem estar abertas para extensao, mas
 * fechadas para modificacao.
 * 
 */
public class StartbuzzCoffe {

	public static void main(String[] args) {

		Beverage beverage = new Expressso();
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		beverage = new Whip(beverage);

		System.out.println(beverage.getDescription() + " $" + beverage.cost());

	}

}
