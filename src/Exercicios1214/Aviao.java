package Exercicios1214;

public class Aviao {
	String Nome;
	String Cor;
	int modelo;
	Boolean funcionamento;
	double altitude;
	
	public void ligar()
	{
		funcionamento = true;
	}
	public void desligar()
	{
		funcionamento=false;
	}
	public void decolar()
	{
		if (funcionamento==true)
			System.out.println("O avi�o est� pronto para decolar");
		else
			System.out.println("O avi�o est� desligado!!");
	}
	public void caracteristicas()
	{
		System.out.println("O avi�o se chama "+this.Nome+", modelo "+this.modelo+", cor "+this.Cor);
		System.out.println("Sua altitude m�xima � de "+this.altitude+" metros");
	}
}
