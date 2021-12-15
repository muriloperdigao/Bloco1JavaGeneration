package Exercicio1215;

public class Cachorro extends Animal{
	
	private String som;
	private String ação;
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAção() {
		return ação;
	}
	public void setAção(String ação) {
		this.ação = ação;
	}
	
	public void façaAlgo()
	{
		if (this.ação=="correr")
			System.out.println("O cachorro está correndo. Que bonitinho.");
		else
			System.out.println("Cachorro não sobre em árvore!");
	}
	public void façaSom()
	{
		System.out.println("O cachorro está falando: "+this.som);
	}
	
}
