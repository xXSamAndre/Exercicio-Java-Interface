package model;

import javax.swing.JOptionPane;

public class CD extends Produto{

	private int faixas;
	
	public CD() {
		
	}

	public CD(String nome, double produto, int faixas) {
		super(nome, produto);
		this.faixas = faixas;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null,"CDs  \n" + "CD:  "+getNome()+"\n Preço R$  "+getPreco()+"\n Faixas:  "+getFaixas() + "  músicas" );
	
	}
	
	
	
	
	
	
	
	
	
	
}
