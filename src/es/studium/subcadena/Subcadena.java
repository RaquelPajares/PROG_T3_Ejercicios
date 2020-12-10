package es.studium.subcadena;
/*
 * Subcadena - Realizar un programa que lea una cadena, una posición y una
longitud y mediante una función obtengamos la subcadena que empieza en la
posición dada y tiene longitud caracteres de la cadena original.
 */

import java.util.Scanner;

public class Subcadena
{

	public static void main(String[] args)
	{
		//VARIABLES
		String cadena, subcadena; 
		int posicion, longitud;
		
		//Teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique una cadena: ");
		cadena = teclado.nextLine(); 
		
		System.out.println("Indique una posición: ");
		posicion = teclado.nextInt(); 
		
		System.out.println("Indique una longitud de caracteres: ");
		longitud = teclado.nextInt(); 
		
		teclado.close();
		
		subcadena = funSubcadena(cadena, posicion, longitud);
		
		System.out.println("La subcadena vale: '" + subcadena + "'");
		
	}
	public static String funSubcadena(String s, int p, int l)
	{
		String r = ""; 
		
		for(int i=p;i<(p+l);i++)
		{
			r = r + s.charAt(i);
		}
		return(r); 
	}

}
