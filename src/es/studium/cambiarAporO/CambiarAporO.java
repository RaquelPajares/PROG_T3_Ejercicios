package es.studium.cambiarAporO;

import java.util.Scanner;

/*Cambiar a por o - Realizar un programa que lea una cadena y cambie todas las
vocales ‘a’ por vocales ‘o’.*/

public class CambiarAporO
{

	public static void main(String[] args)
	{
		//Variables
		String frase; 
		Scanner teclado = new Scanner(System.in); 
		
		//Leer frase
		System.out.println("Dame una frase: ");
		frase = teclado.nextLine();
		teclado.close();
		
		//Cambiar a por o
		frase = frase.replace('a', 'o');
		System.out.println(frase);
	}

}
