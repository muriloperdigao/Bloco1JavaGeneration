package POO;

public class POO1 {
	public static void main(String[] args) {
		
		class Bicicleta {
			int velocidade = 0;
			int marcha = 1;
			
			void mudarMarcha(int novoValor) {
				marcha = novoValor;
			}
			
			void aumentarVelocidade(int incremento) {
				velocidade = velocidade + incremento;
			}
			void aplicarFreios(int decremento) {
				velocidade = velocidade - decremento;
			}
		}
		
		Bicicleta bicicleta1 = new Bicicleta();
		
	}
		

}
