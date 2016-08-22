package br.com.decoratorpattern2;

public class TextViewBorda extends TextViewDecorator {

	public TextViewBorda(TextViewInterface textViewInterface) {
		super(textViewInterface);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write() {
		System.out.println("Adiciona borda ao Text View");
	}
	
	

}
