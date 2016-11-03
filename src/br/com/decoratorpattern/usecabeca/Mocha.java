package br.com.decoratorpattern.usecabeca;

public class Mocha extends CondimentDecorator {

	protected Beverage beverage;
	
	public Mocha(final Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + ", Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
