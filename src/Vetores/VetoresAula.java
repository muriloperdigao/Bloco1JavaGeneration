package Vetores;

import java.util.Scanner;

public class VetoresAula {
	public static void main(String[] args) {
		
		int[] vet = new int[5];
		int[] vet2= {4,5,6,7};
		int soma=0, x;
		Scanner leia = new Scanner(System.in);
		for (int i : vet2 )
			System.out.println(i);
		for (x=0;x<5;x++)
		{
			System.out.println("Digite um valor: ");
			vet[x]=leia.nextInt();
			soma+=vet[x];
		}
		System.out.println("A soma é: "+soma);
		System.out.println("Os números digitados foram:");
		for (x=0;x<5;x++)
		{
			System.out.println(vet[x]);			
		}
		System.out.println("O tamanho do array é: "+vet.length);
	}


}
