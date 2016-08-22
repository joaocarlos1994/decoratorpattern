package br.com.decoratorpattern;

public class Main {

	public static void main(String[] args) {
		
		Shape circulo = new Circle();
		Shape decorator = new RedShapeDecorator(circulo);
		decorator.draw();

	}

}
