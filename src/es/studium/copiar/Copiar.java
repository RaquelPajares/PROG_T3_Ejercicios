package es.studium.copiar;

import java.util.Scanner;

/*Copiar - Realizar un programa que copie una cadena leída por teclado en otra.
 */

public class Copiar
{

	public static void main(String[] args)
	{
		// Manera fácil
		String cadena; 
		String cadenaCopiada;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba una cadena de caracteres: ");
		cadena = teclado.nextLine(); 
		
		teclado.close();

		cadenaCopiada = cadena; 
		
		System.out.println("La cadena copiada es " + cadenaCopiada);
		
		//Manera de copiar caracter a caracter
		/*int i
		for(int i=0;i<frase.length();i++)
		{
			cadena2 = cadena2 + cadena1.charAt(i); 
		}
		System.out.println("La cadena copiada es " + cadena2);
		*/
	}

}
