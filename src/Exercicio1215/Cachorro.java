package Exercicio1215;

public class Cachorro extends Animal{
	
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
		if (this.a��o=="correr")
			System.out.println("O cachorro est� correndo. Que bonitinho.");
		else
			System.out.println("Cachorro n�o sobre em �rvore!");
	}
	public void fa�aSom()
	{
		System.out.println("O cachorro est� falando: "+this.som);
	}
	
}
