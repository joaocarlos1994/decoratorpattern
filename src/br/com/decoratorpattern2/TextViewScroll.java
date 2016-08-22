package br.com.decoratorpattern2;

public class TextViewScroll extends TextViewDecorator {

	public TextViewScroll(TextViewInterface textViewInterface) {
		super(textViewInterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write() {
		System.out.println("Adiciona scroll ao Text View");
	}
	
	

}
