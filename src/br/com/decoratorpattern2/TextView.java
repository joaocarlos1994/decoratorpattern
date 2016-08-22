package br.com.decoratorpattern2;

public class TextView implements TextViewInterface {
	
	private String texto;

	public TextView(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public void write() {
		System.out.println(getTexto());
	}

}
