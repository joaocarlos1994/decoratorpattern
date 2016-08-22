package br.com.decoratorpattern;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		getShape().draw();
		adicionarBordarVermelha(getShape());
	}
	
	private void adicionarBordarVermelha(Shape shape){
		System.out.println("Adicionar borda vermelha");
	}

}
