package estudo_strategy;

public class TesteImposto {

	public static void main(String[] args) {

		Orcamento orcamento = OrcamentoBuilder.builder()
								.descricao("teste")
								.valor(50.90)
								.build();
		
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		
		CalculaImposto calculaImposto = new CalculaImposto();
		calculaImposto.realizaCalculoImposto(orcamento, icms);
		calculaImposto.realizaCalculoImposto(orcamento, iss);
	}

}
