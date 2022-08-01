package entities;

import model.AluguelCarro;
import model.Fatura;

public class ServicoAluguel {

	private double precoHora;
	private double precoDiaria;
	
	
	private TaxaBrasil taxaBrasil;


	public ServicoAluguel(double precoHora, double precoDiaria, TaxaBrasil taxaBrasil) {
		this.precoHora = precoHora;
		this.precoDiaria = precoDiaria;
		this.taxaBrasil = taxaBrasil;
	}
	
	public void processarAluguel(AluguelCarro aluguelCarro) {
		long t1 = aluguelCarro.getComeco().getTime();	
		long t2 = aluguelCarro.getFim().getTime();
		double horas = (t2 - t1)/ 1000 / 60 / 60;
		
		double pagamentoBasico;
		if (horas <= 12) {
			pagamentoBasico = Math.ceil(horas) + precoHora;
		} else {
			pagamentoBasico = Math.ceil(horas / 24) + precoDiaria;
		}
		double taxa = taxaBrasil.taxa(pagamentoBasico);
		aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));
		
		
		
		}
	
	
	
	
}
