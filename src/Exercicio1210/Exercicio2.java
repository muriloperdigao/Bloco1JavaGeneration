//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package Exercicio1210;

public class Exercicio2 {
	public static void main(String[] args) {
		int x, par=0, impar=0;
		for (x=1;x<=10;x++) {
			if (x%2==0)
				par++;
			else
				impar++;
		}
		System.out.println("O n�mero de pares �: "+ par+ " e o n�mero de �mpares �: "+impar);
	}


}
