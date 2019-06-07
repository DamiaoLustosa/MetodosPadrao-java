package servico;

public class TaxaJuroUsa implements ServicoJuros{
	private double taxaJuro;
	
	public TaxaJuroUsa(double taxaJuro) {
		this.taxaJuro = taxaJuro;	
	}
	
	@Override
	public double getTaxaJuro() {
		return taxaJuro;
	}
	

}
