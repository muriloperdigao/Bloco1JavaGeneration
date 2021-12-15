package Exercicio1215;

public class Preguiça extends Animal{
	
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
		if (this.ação=="subir")
			System.out.println("A preguiça subindo a árvore, gente!");
		else
			System.out.println("Preguiça não corre.");
	}
	public void façaSom()
	{
		System.out.println("A preguiça está falando: "+ this.som);
	}
	
}
