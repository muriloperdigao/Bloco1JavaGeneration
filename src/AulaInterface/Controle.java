package AulaInterface;

public class Controle implements InterfaceTeste{
	//atributos da classe
	private int volume;
	private boolean ligado;
	private int canal;
	
	//metodo construtor
	public Controle () {
		this.volume=50;
		this.ligado=false;

		//get e setter
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private int getCanal() {
		return canal;
	}

	private void setCanal(int canal) {
		this.canal = canal;
	}

	//metodos da interface
	
	@Override
	public void ligar() {
		if(this.ligado==true)
		{
			System.out.println("Sua TV já está ligada.");
		}
		else
			this.ligado=true;
			System.out.println("Sua TV ligou.");
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisvolume() {
		if (this.ligado==true)
			setVolume(getVolume()+1);
		else
		{
			System.out.println("A TV está desligada. Ligando TV...");
			setLigado(true);
		}
		
	}

	@Override
	public void menosvolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maiscanal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menoscanal() {
		// TODO Auto-generated method stub
		
	}
	
	

}
