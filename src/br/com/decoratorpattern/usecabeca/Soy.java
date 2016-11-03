package br.com.decoratorpattern.usecabeca;

public class Soy extends CondimentDecorator {
	
	protected Beverage beverage;
	
	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .15 + beverage.cost();
	}

}
