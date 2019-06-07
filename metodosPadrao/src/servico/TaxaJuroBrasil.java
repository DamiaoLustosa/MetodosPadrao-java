package servico;

import java.security.InvalidParameterException;

public class TaxaJuroBrasil{
	private double taxaJuro;
	
	public TaxaJuroBrasil(double taxaJuro) {
		this.taxaJuro = taxaJuro;	
	}
	
	public double getTaxaJuro() {
		return taxaJuro;
	}
	
	public double pagamento(double montante, int mes) {
		if (mes <1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return montante * Math.pow(1.0 + taxaJuro / 100, mes); //método Math.pow realiza uma potenciação	
	}
	
	
	

}
