package Exercicio1215;

public class Cachorro1 extends Cachorro{
	public static void main (String args[]) {
		Cachorro c1 = new Cachorro();
		
		c1.setIdade(10);
		c1.setNome("cachorro");
		c1.setSom("AU AU AU QUERO RAÇÃO!");
		c1.setAção("correr");
		
		c1.caracteristicas();
		c1.façaSom();
		c1.façaAlgo();
			
	}
	
}
