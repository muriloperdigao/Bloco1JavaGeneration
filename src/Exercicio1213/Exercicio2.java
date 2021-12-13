package Exercicio1213;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] x = new int[10];
		int n, soma=0, media, y=0;
		
		for(n=0;n<10;n++)
		{
			System.out.println("Informe o valor do dado: ");
			x[n]=leia.nextInt();
			
			if (x[n]==6)
				y++;
			soma = soma + x[n];
		}
		System.out.println("Os números informados foram: ");
		for(n=0;n<10;n++)
		{
			System.out.println(x[n]);
		}
		media = soma / x.length;
		System.out.println("A média é: "+media);
	}
}
