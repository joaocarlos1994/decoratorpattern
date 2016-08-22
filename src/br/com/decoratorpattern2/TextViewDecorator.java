package br.com.decoratorpattern2;

import java.util.ArrayList;
import java.util.List;

public class TextViewDecorator implements TextViewInterface {
	
	private TextViewInterface textViewInterface;
	private List<TextViewInterface> textViewInterfaceDecorator;

	public TextViewDecorator(TextViewInterface textViewInterface) {
		super();
		this.textViewInterface = textViewInterface;
		this.textViewInterfaceDecorator = new ArrayList<>();
	}
	
	public void adicionarDecorador(final TextViewInterface textViewInterface){
		textViewInterfaceDecorator.add(textViewInterface);
	}
	
	@Override
	public void write() {
		textViewInterface.write();
		for (TextViewInterface textViewInterface : textViewInterfaceDecorator) {
			textViewInterface.write();
		}
	}

}
