package es.studium.aaaEjemploTabla3;

import java.util.Scanner;

public class EjemploTabla3
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		
		int i; 
		int tabla1[] = new int[TAM];
		float tabla2[] = new float[TAM];
		
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<TAM;i++)
		{
			System.out.println("Indica el valor de la tabla[" + i + "]");
			tabla1[i] = teclado.nextInt(); 
		}
		
		teclado.close();
		
		for(i=0;i<TAM;i++)
		{
			tabla2[i] = (float) tabla1[i] / 2;
			System.out.println(tabla2[i]);
			
		}
	}

}
