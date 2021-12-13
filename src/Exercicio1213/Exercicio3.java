package Exercicio1213;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] n1 = new int [4][6];
		int[][] n2 = new int [4][6];
		int[][] m1 = new int [4][6];
		int[][] m2 = new int [4][6];
		int l=0, c=0;
		
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.println("Digite um valor para a matriz n1: ");
				n1[l][c]=leia.nextInt();
			}
		}
		
		System.out.println("A matriz n1 é:");
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print(n1[l][c]+"\t");
			}
			System.out.println();
		}
		
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.println("Digite um valor para a matriz n2: ");
				n2[l][c]=leia.nextInt();
			}
		}
		
		System.out.println("A matriz n2 é:");
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print(n2[l][c]+"\t");
			}
			System.out.println();
		}
		
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				m1[l][c]=n1[l][c]+n2[l][c];
				m2[l][c]=n1[l][c]-n2[l][c];
			}
		}
		
		System.out.println("A matriz m1 é:");
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print(m1[l][c]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("A matriz m2 é:");
		for(l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print(m2[l][c]+"\t");
			}
			System.out.println();
		}
	}
}
