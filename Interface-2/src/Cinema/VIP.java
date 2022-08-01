package Cinema;

import javax.swing.JOptionPane;

public class VIP extends Ingresso{

	private double vVIP;
	
	public VIP() {
			
	}

	public VIP(double valor) {
	 super(valor);
		
	}

	public double getvVIP() {
		return vVIP;
	}

	public void setvVIP(double vVIP) {
		this.vVIP = vVIP;
	}

	public double valorVip() {
		return getValor() * 1.2;
	}
	
	public void Imprime() {
		JOptionPane.showMessageDialog(null,"Valor: R$"+valorVip());
	}
	
	

}
