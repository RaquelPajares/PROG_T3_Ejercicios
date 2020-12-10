package es.studium.posicionMaximo;

import java.util.Scanner;

/*– Realizar un programa que lea 10 enteros y calcule el valor
máximo y muestre su posición. En el caso de que el máximo se repita, indicar
todas las posiciones donde aparece.*/

public class PosicionMaximo
{

	public static void main(String[] args)
	{
		//VARIABLES
		final int TAM = 10; //Indica tamaño de la tabla
		int tabla[] = new int[TAM];
		int i, maximo; 
		
		Scanner teclado = new Scanner(System.in);

		//Rellenar la tabla
		for(i=0;i<TAM;i++)
		{
			System.out.println("Dame el valor de la posición " + i);
			tabla[i] = teclado.nextInt();
		}
		
		//Recorrer la tabla buscando el máximo
		maximo = tabla[0];
		for(i=0;i<TAM;i++)
		{
			if(tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		System.out.println("El valor máximo es: " + maximo);
		
		//Para ver cuántas veces aparece el elemento máximo
		for(i=0;i<TAM;i++)
		{
			if(tabla[i]==maximo)
			{
				System.out.println("Encontrado el máximo en: " +i);
			}
		}
		teclado.close();
	}

}
