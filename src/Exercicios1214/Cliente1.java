package Exercicios1214;

public class Cliente1 {
	public static void main (String args[])
	{
		Cliente c1 = new Cliente();
		c1.Nome="Murilo";
		c1.Sobrenome="Perdigão";
		c1.numero=125663;
		c1.cadastrado=true;
		c1.seguir();
		c1.dados();
	}
}
