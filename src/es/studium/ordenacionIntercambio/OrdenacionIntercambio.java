package es.studium.ordenacionIntercambio;

import java.util.Scanner;

public class OrdenacionIntercambio
{

	public static void main(String[] args)
	{
		final int TAM = 10; 
		int tabla[] = new int[TAM];
		int i, j, aux; 
		
		Scanner teclado = new Scanner(System.in); 
		
		for(i=0;i<10;i++)
		{
			System.out.println("Dame un número entero[" + i + "]: ");
			tabla[i] = teclado.nextInt();
		}
		
		teclado.close();
		
		for (i=0; i<TAM-1; i++)
		{
			for (j=i+1; j<TAM; j++)
			{
				if (tabla[i]>tabla[j])
				{
					aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux; 
				}
			}
		}
		
		System.out.println("La tabla ordenada: ");
		for(i=0; i<TAM; i++)
		{
			System.out.println(tabla[i]);
		}
	}

}
