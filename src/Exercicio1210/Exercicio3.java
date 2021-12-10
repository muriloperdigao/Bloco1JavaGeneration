//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.

package Exercicio1210;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int i,h, x=0,y=0;
		Scanner leia = new Scanner(System.in);
		for(i=1;i<=5;i++)
		{
			System.out.println("Participante "+i+", informe a sua idade: ");
			h = leia.nextInt();
			
			if (h<21)
				x++;
			if (h>50)
				y++;
		}
		
		System.out.println("O número depessoas com menos de 20 anos é: "+x);
		System.out.println("O número depessoas com mais de 50 anos é: "+y);

	}
	


}
