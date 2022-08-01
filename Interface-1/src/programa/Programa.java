package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ServicoAluguel;
import entities.TaxaBrasil;
import model.AluguelCarro;
import model.Veiculo;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Informaçãoes sobre a locação: ");
		System.out.println("Modelo de carro:  ");
		String modelo = sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy HH:mm):  ");
		Date comeco = sdf.parse(sc.nextLine());
		System.out.println("Devolução (dd/MM/yyyy HH:mm):  ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarro ac = new AluguelCarro(comeco, fim, new Veiculo(modelo));
		
		System.out.println("Valor da hora:  ");
		double valorHora = sc.nextDouble();
		System.out.println("Valor do dia:  ");
		double valorDia = sc.nextDouble();
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(valorHora, valorDia, new TaxaBrasil());
		
		servicoAluguel.processarAluguel(ac);
		
		System.out.println("---------------------------------");
		System.out.println("Fatura:  ");
		System.out.println("Pagamento basico:  " + String.format("%.2f", ac.getFatura().getPagamento()));
		System.out.println("Taxa:  " +             String.format("%.2f", ac.getFatura().getTaxa()));
		System.out.println("Pagamento total:  " +  String.format("%.2f", ac.getFatura().getPagamentoTotal()));
		
		
	}

}
