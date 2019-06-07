package servico;

import java.security.InvalidParameterException;

public class TaxaJuroUsa implements ServicoJuros{
	private double taxaJuro;
	
	public TaxaJuroUsa(double taxaJuro) {
		this.taxaJuro = taxaJuro;	
	}
	
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
	
	@Override
	public double pagamento(double montante, int mes) {
		if (mes <1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return montante * Math.pow(1.0 + taxaJuro / 100, mes); //método Math.pow realiza uma potenciação	
	}
	
	
	

}
