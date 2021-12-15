package Exercicio1215;

public class Animal {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void caracteristicas ()
	{
		System.out.println("Este é um "+this.nome+" e tem "+this.idade+ " anos.");
	}
}
