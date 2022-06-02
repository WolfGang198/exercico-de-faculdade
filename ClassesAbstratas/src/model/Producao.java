package model;

public class Producao extends Empregado {
	private double quantidadeProduzida;
	private double valorUnidade; 
	
	public Producao(String nome, String fone)
	{
		super(nome, fone);
	}
	@Override
	public double salario()
	{
		return valorUnidade * quantidadeProduzida;
	}

	public double getQuantidadeProduzida() {
		return quantidadeProduzida;
	}

	public void setQuantidadeProduzida(double quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}

	public double getValorUnidade() {
		return valorUnidade;
	}

	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
    
}
