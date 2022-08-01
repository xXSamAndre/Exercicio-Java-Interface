package model;

import javax.swing.JOptionPane;

public class DVD extends Produto{

	private int minutos;
	
	public DVD() {
		
	}

	public DVD(String nome, double preco, int minutos) {
		super(nome, preco);
		this.minutos = minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "DVD:  \n"+"Filme:  " + getNome()+"\nPreço R$ "+ getPreco()+"\nDuração:  "+getMinutos()+" minutos");
	}
	
	
	
	
	
	
}
