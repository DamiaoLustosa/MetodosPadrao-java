package servico;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	
	double getTaxaJuro();
	
	//Usa-se a palavra 'default' para criar métodos-padrão
	default double pagamento(double montante, int mes) { //Criação de método default para ser utilizado em todas as classes que implementam a interface
		if (mes <1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return montante * Math.pow(1.0 + getTaxaJuro() / 100, mes); //método Math.pow realiza uma potenciação	
	}
	

}
