package br.com.decoratorpattern.usecabeca;

public class Expressso extends Beverage {

	public Expressso() {
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	
	@Override
	public String getDescription() {
		return "Expresso";
	}

}
