package Exercicio1213;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vet = new int[5];
		int x, maior=0;
		for(x=0;x<5;x++)
		{
			System.out.println("Entre com uma nota: ");
			vet[x]=leia.nextInt();
			if (vet[x]>maior)
				maior=vet[x];
					
		}
		System.out.println("Os valores inscritos são: "+vet[0]+" "+vet[1]+" "+vet[2]+" "+vet[3]+" "+vet[4]);
		System.out.println("O maior valor é: "+maior);
	}

}
