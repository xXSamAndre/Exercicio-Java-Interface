package model;

import java.util.Date;

public class AluguelCarro {

	private Date comeco;
	private Date fim;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro(Date comeco, Date fim, Veiculo veiculo) {
		this.comeco = comeco;
		this.fim = fim;
		this.veiculo = veiculo;
		
	}

	public Date getComeco() {
		return comeco;
	}

	public void setComeco(Date comeco) {
		this.comeco = comeco;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	
	
	
	
}
