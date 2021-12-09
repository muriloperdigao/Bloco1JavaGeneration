package Exercicio1208;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		int dia, mes, ano, res;
		Scanner leia = new Scanner(System.in);

		System.out.println("Diga quantos dias de vida você tem: ");
		dia = leia.nextInt();
		ano = dia/365;
		mes = dia%365/30;
		res = dia%365%30;
		
		System.out.println("Ótimo, isso significa que você tem: "+ano+" anos "+ mes+" meses e "+ res+" dias de vida.");
		
		

}
}
