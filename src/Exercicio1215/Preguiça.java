package Exercicio1215;

public class Pregui�a extends Animal{
	
	private String som;
	private String a��o;
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getA��o() {
		return a��o;
	}
	public void setA��o(String a��o) {
		this.a��o = a��o;
	}
	
	public void fa�aAlgo()
	{
		if (this.a��o=="subir")
			System.out.println("A pregui�a subindo a �rvore, gente!");
		else
			System.out.println("Pregui�a n�o corre.");
	}
	public void fa�aSom()
	{
		System.out.println("A pregui�a est� falando: "+ this.som);
	}
	
}
