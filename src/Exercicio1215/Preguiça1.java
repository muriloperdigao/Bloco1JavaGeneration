package Exercicio1215;

public class Preguiça1 extends Preguiça{
	public static void main (String args[]) {
		Preguiça p1 = new Preguiça();
		
		p1.setIdade(50);
		p1.setNome("preguiça");
		p1.setSom("Nossa, que sono. Tchau.");
		p1.setAção("subir");
		
		p1.caracteristicas();
		p1.façaSom();
		p1.façaAlgo();
		
	}
}
