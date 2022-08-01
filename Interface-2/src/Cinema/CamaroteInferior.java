package Cinema;

import javax.swing.JOptionPane;

public class CamaroteInferior extends VIP{

	public CamaroteInferior() {
		
	}

	public CamaroteInferior(double valor) {
		super(valor);
		
	}
	
	public double ValorCI() {
		return getValor() * 1.4;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso no camorote inferior:  \n" + "valor: R$" + ValorCI());
	}
}
