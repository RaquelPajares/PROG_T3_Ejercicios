package es.studium.simetrica;

import java.util.Scanner;

/*Simétrica - Realizar un programa que lea una matriz de 3x3 e indique si es
simétrica o no. NOTA: Simétrica si a[i][j]=a[j][i]*/

public class Simetrica
{

	public static void main(String[] args)
	{
		final int FILAS = 3; 
		final int COLUMNAS = 3; 
		int tabla[][] = new int[FILAS][COLUMNAS];
		int i, j; 
		boolean esSimetrica = true;
		
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<FILAS;i++) 
		{
			for(j=0;j<COLUMNAS;j++)
			{
				System.out.println("Indique los valores de la tabla [" + i + "][" + j + "]: ");
				tabla[i][j] = teclado.nextInt();
			}
		}
		
		teclado.close();
		
		//System.out.print(tabla[i][j] + "\t");
		for(i=0;i<FILAS;i++) 
		{
			for(j=0;j<COLUMNAS;j++)
			{
				if(tabla[i][j]!=tabla[j][i]) 
				{
					esSimetrica = false;
				}
			}
		}
		
		if(esSimetrica)
		{
			System.out.println("La matriz es simétrica.");
		}
		else
		{
			System.out.println("La matriz NO es simétrica.");
		}
	}
}

		