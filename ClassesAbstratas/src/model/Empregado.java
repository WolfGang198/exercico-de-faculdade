package model;

public abstract class Empregado {
	private String nome;
	private String fone;
	

	
	public Empregado(String pNome, String pFone)
	{
		this.nome = pNome;
		this.fone = pFone;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getFone()
	{
		return this.fone;
	}
	
	public void setFone(String fone)
	{
		this.fone = fone;
	}
	
	//Método abstrato
	public abstract double salario();
}
