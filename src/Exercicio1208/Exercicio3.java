package Exercicio1208;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int segundos,horas,minutos,resto;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Diga quantos segundos este evento durou: ");
		segundos = leia.nextInt();
		horas = segundos / 3600;
		minutos = segundos%3600/60;
		resto = segundos%3600%60;
		
		System.out.println("Ótimo, isso significa que o evento durou: "+ horas+" horas "+ minutos+" minutos e "+ resto+" segundos.");
	}

}
