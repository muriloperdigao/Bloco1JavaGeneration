package Exercicios1214;

public class Cliente {
	String Nome;
	String Sobrenome;
	int numero;
	Boolean cadastrado;
	
	public void seguir()
	{
		cadastrado=true;
		System.out.println("O cliente está cadastrado.");
	}
	public void cadastrar()
	{
		cadastrado=false;
		System.out.println("O cliente não está cadastrado");
	}
	public void dados()
	{
		System.out.println("O nome do cliente é: "+this.Nome);
		System.out.println("O sobrenome do cliente é: "+this.Sobrenome);
		System.out.println("O número do cliente é: "+this.numero);
	}
	
	

}
