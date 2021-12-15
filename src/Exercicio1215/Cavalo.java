package Exercicio1215;

public class Cavalo extends Animal{
	
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
			System.out.println("O cavalo está correndo. Que lindo.");
		else
			System.out.println("Cavalo não sobre em árvore!");
	}
	public void façaSom()
	{
		System.out.println("O cavalo está falando: "+ this.som);
	}
	
}
