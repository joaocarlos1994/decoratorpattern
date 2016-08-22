package br.com.decoratorpattern2;

public class TextViewLarge extends TextViewDecorator {

	public TextViewLarge(TextViewInterface textViewInterface) {
		super(textViewInterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write() {
		System.out.println("Criando Text View Large");
	}

}
