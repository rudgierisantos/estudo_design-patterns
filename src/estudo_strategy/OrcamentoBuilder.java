package estudo_strategy;

public class OrcamentoBuilder {
	
	private Orcamento orcamento;
	
	private OrcamentoBuilder() {
		orcamento = new Orcamento();
	}
	
	public static OrcamentoBuilder builder(){
		return new OrcamentoBuilder();
	}
	
	public OrcamentoBuilder descricao(String descricao) {
		this.orcamento.descricao = descricao;
		return this;
	}

	public OrcamentoBuilder valor(double valor) {
		this.orcamento.valor = valor;
		return this;
	}
	
	public Orcamento build(){
		return this.orcamento;
	}
}
