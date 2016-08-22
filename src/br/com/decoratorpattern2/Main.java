package br.com.decoratorpattern2;

public class Main {
	
	public static void main(String[] args) {
		
		TextViewInterface textView = new TextView("Criando Text View");
		TextViewInterface textViewBorda = new TextViewBorda(textView);
		TextViewInterface textScroll = new TextViewScroll(textView);
		TextViewInterface textViewLarge = new TextViewLarge(textView);
		
		TextViewDecorator textViewDecorator = new TextViewDecorator(textView);
		textViewDecorator.adicionarDecorador(textViewBorda);
		textViewDecorator.adicionarDecorador(textScroll);
		textViewDecorator.adicionarDecorador(textViewLarge);
		
		textViewDecorator.write();
		
	}
	

}
