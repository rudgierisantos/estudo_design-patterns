package estudo_strategy;

public class CalculaImposto {

	 public void realizaCalculoImposto(Orcamento orcamento, Imposto impostoQualquer){
		 double valorCalculado = impostoQualquer.calcula(orcamento);
		 System.out.println(valorCalculado);
	 }
}