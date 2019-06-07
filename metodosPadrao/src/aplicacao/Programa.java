package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servico.TaxaJuroBrasil;

public class Programa {
	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Montante :");
		double montante = sc.nextDouble();
		System.out.println("Meses :");
		int mes = sc.nextInt();
		
		TaxaJuroBrasil tjb = new TaxaJuroBrasil(2.0);
		double pagamento = tjb.pagamento(montante, mes);
		
		System.out.println("Pagamento após :" + mes + " Meses");;
		System.out.println(String.format("%.2f", pagamento));
		
		
		
		
		
		sc.close();		
		
	}

}
