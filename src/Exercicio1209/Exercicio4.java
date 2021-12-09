package Exercicio1209;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double i,t;
	System.out.println("Informe um número: ");
	i = leia.nextInt();
	
	if (i%2==0)
	{
		System.out.println("Este número é par.");
		t=Math.pow(i, 0.5);
		System.out.println("A raiz de "+i+" é "+t);
	}
	else
	{
		System.out.println("Este número é ímpar.");
		t=Math.pow(i, 2);
		System.out.println(i+" ao quadrado é "+t);
	}
}
}
