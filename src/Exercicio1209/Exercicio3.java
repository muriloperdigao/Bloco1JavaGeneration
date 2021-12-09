package Exercicio1209;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

	int i;
	System.out.println("Informe sua idade: ");
	i = leia.nextInt();
	if (i<10 || i>25)
		System.out.println("Você não tem idade.");
	else if (i>=10 && i<=14)
		System.out.println("Você é infantil.");
	else if(i>=15 && i<=17)
		System.out.println("Você é juvenil");
	else
		System.out.println("Você é adulto.");
	}
}
