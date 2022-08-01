package model;

import javax.swing.JOptionPane;

public class Livro extends Produto{
  
	private String autor;
	
	public Livro() {
		
	}

	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Livros \n"+ "Nome do livro:  "+getNome()+ "\nAutor:  "+getAutor()+"\nPreço R$ " + getPreco());
	}
	
	
	
	
	
	
	
	
}
