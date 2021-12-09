package Exercicio1209;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b, c, maior1=0, maior2=0, maior=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Diga um número: ");
		a = leia.nextInt();
		System.out.println("Diga um número: ");
		b = leia.nextInt();
		System.out.println("Diga um número: ");
		c = leia.nextInt();
		
		if (a >= b)
		{
			maior1 = a;
		}
		else if (b>a)
		{
			maior1 = b;
		}
		if (b>=c)
		{
			maior2=b;
		}
		else if (c>b)
		{
			maior2=c;
		}
		if (maior1>=maior2)
		{
			maior=maior1;
		}
		else if (maior2>maior1)
		{
			maior=maior2;
		}
		System.out.println("O maior número é: "+maior);
	}

}
