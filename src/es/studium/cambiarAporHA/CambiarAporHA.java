package es.studium.cambiarAporHA;

import java.util.Scanner;

/*Cambiar a por ha - Realizar un programa que lea una cadena y cambie todas las
vocales ‘a’ por ‘ha’*/

public class CambiarAporHA
{

	public static void main(String[] args)
	{
		//VARIABLES
		String frase; 
		
		Scanner teclado = new Scanner(System.in); 
		
		//Leer frase
		System.out.println("Dame una frase que contenga la letra a: ");
		frase = teclado.nextLine();
		teclado.close();
		
		//Cambiar a por ha
		for(int i=0;i<frase.length();i++)
		{
			if(frase.charAt(i)=='a')
			{
				System.out.print("ha");
			}
			else
			{
				System.out.print(frase.charAt(i));
			}
		}

	}

}
