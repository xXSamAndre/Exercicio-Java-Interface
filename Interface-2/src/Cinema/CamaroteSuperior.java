package Cinema;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{

	public CamaroteSuperior() {
		
	}

	public CamaroteSuperior(double valor) {
		super(valor);
		
	}
	
	public double valorCS() {
		return getValor() * 1.6;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso no Camorote superior: " + "Valor: R$ "+valorCS());
	}
	
}
