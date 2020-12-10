package es.studium.subcadena2;

import java.util.Scanner;

/*
 * Subcadena2 � Realizar un programa que obtenga la parte derecha de una
cadena de caracteres indicando la cadena y un valor num�rico entero que nos
dir� cu�ntos caracteres debemos obtener desde el final de la cadena
 */

public class Subcadena2
{

	public static void main(String[] args)
	{

		//VARIABLES
		String cadena, subcadena; 
		int longitud;
		
		//Teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique una cadena: ");
		cadena = teclado.nextLine(); 
		
		System.out.println("Indique una longitud de caracteres: ");
		longitud = teclado.nextInt(); 
		
		teclado.close();
		
		subcadena = funSubcadena(cadena, longitud);
		
		System.out.println("La subcadena vale: '" + subcadena + "'");
		
	}
	
	public static String funSubcadena(String s, int l)
	{
		String r = ""; 
		
		for(int i=(s.length()-l);i<(s.length());i++)
		{
			r = r + s.charAt(i);
		}
		
		return(r); 
	}

}

