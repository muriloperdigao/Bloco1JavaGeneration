package Exercicios1214;

public class Cliente {
	String Nome;
	String Sobrenome;
	int numero;
	Boolean cadastrado;
	
	public void seguir()
	{
		cadastrado=true;
		System.out.println("O cliente est� cadastrado.");
	}
	public void cadastrar()
	{
		cadastrado=false;
		System.out.println("O cliente n�o est� cadastrado");
	}
	public void dados()
	{
		System.out.println("O nome do cliente �: "+this.Nome);
		System.out.println("O sobrenome do cliente �: "+this.Sobrenome);
		System.out.println("O n�mero do cliente �: "+this.numero);
	}
	
	

}
