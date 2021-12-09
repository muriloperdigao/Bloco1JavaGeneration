package Exercicio1209;

import java.util.Scanner;

public class Ecercicio2 {
	public static void main(String[] args) {

	int a,b,c, p1,p2,p3;
	Scanner leia = new Scanner(System.in);
	System.out.println("Diga um número: ");
	a = leia.nextInt();
	System.out.println("Diga um número: ");
	b = leia.nextInt();
	System.out.println("Diga um número: ");
	c = leia.nextInt();
	
	if (a>=b && a>=c && b>=c) 
		System.out.println("A ordem crescente é: "+c+", "+b+", "+a);
	if (a>=b && a>=c && c>=b) 
		System.out.println("A ordem crescente é: "+b+", "+c+", "+a);
	if (b>=a && b>=c && a>=c) 
		System.out.println("A ordem crescente é: "+c+", "+a+", "+b);
	if (b>=a && b>=c && c>=a) 
		System.out.println("A ordem crescente é: "+a+", "+c+", "+b);
	if (c>=a && c>=b && a>=b) 
		System.out.println("A ordem crescente é: "+b+", "+a+", "+c);
	if (c>=a && c>=b && b>=a)
		System.out.println("A ordem crescente é: "+a+", "+b+", "+c);
	}
}
