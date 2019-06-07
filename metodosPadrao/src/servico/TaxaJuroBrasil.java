package servico;

public class TaxaJuroBrasil implements ServicoJuros{
	private double taxaJuro;
	
	public TaxaJuroBrasil(double taxaJuro) {
		this.taxaJuro = taxaJuro;	
	}
	
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
	


}
