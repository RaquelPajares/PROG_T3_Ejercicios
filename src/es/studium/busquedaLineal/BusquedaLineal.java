package es.studium.busquedaLineal;

import java.util.Scanner;

public class BusquedaLineal
{

	public static void main(String[] args)
	{
		final int TAM = 10; 
		int tabla[] = new int[TAM];
		int i; 
		boolean encontrado; 
		int elemento; 
		
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			System.out.println("Dame un número entero[" + i + "]: ");
			tabla[i] = teclado.nextInt();
		}
		
		System.out.println("Indica el elemento que quieras buscar: ");
		elemento = teclado.nextInt(); 
		
		teclado.close();
		
		encontrado = false; 
		i=0; 
		
		while ((!encontrado) && (i<TAM))
		{
			if(tabla[i] == elemento)
			{
				encontrado = true;	
			}
			else
			{
				i++;
			}
		}
		
		if (encontrado)
		{
			System.out.println("El elemento se encontró en la posición " + i);
		}
		else
		{
			System.out.println("El elemento NO se ha encontrado.");
		}
	}

}
