package br.com.decoratorpattern.usecabeca;

public class Whip extends CondimentDecorator {

	protected Beverage beverage; 
	
	public Whip(final Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + ", Whip";
	}

	@Override
	public double cost() {
		return .10 + beverage.cost();
	}

}
