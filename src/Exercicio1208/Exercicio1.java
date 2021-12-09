package Exercicio1208;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int dia, mes, ano, res;
		Scanner leia = new Scanner(System.in);

		System.out.println("Diga o dia que nasceu: ");
		dia = leia.nextInt();
		System.out.println("Diga o mês que nasceu: ");
		mes = leia.nextInt();
		System.out.println("Diga a sua idade: ");
		ano = leia.nextInt();
		
		res = dia + mes * 30 + ano * 365;
		System.out.println("Ótimo, isso significa que você tem: "+ res+ " dias de vida");
		
	}

}
