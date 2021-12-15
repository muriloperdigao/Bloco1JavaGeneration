package Exercicio1215;

public class Cavalo1 extends Cavalo{
	public static void main (String args[]) {
		Cavalo c1 = new Cavalo();
		
		c1.setIdade(20);
		c1.setNome("cavalo");
		c1.setSom("Iiirrrrí quero subir em uma árvore");
		c1.setAção("subir em árvore");
		
		c1.caracteristicas();
		c1.façaSom();
		c1.façaAlgo();
		
	}
}
