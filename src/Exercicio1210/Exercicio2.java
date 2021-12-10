//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

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
		System.out.println("O número de pares é: "+ par+ " e o número de ímpares é: "+impar);
	}


}
