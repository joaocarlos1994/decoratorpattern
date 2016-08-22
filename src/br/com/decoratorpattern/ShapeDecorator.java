package br.com.decoratorpattern;

public abstract class ShapeDecorator implements Shape {
	
	private Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}
	
	
	
}
