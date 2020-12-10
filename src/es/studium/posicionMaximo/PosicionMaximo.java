package es.studium.posicionMaximo;

import java.util.Scanner;

/*� Realizar un programa que lea 10 enteros y calcule el valor
m�ximo y muestre su posici�n. En el caso de que el m�ximo se repita, indicar
todas las posiciones donde aparece.*/

public class PosicionMaximo
{

	public static void main(String[] args)
	{
		//VARIABLES
		final int TAM = 10; //Indica tama�o de la tabla
		int tabla[] = new int[TAM];
		int i, maximo; 
		
		Scanner teclado = new Scanner(System.in);

		//Rellenar la tabla
		for(i=0;i<TAM;i++)
		{
			System.out.println("Dame el valor de la posici�n " + i);
			tabla[i] = teclado.nextInt();
		}
		
		//Recorrer la tabla buscando el m�ximo
		maximo = tabla[0];
		for(i=0;i<TAM;i++)
		{
			if(tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		System.out.println("El valor m�ximo es: " + maximo);
		
		//Para ver cu�ntas veces aparece el elemento m�ximo
		for(i=0;i<TAM;i++)
		{
			if(tabla[i]==maximo)
			{
				System.out.println("Encontrado el m�ximo en: " +i);
			}
		}
		teclado.close();
	}

}
