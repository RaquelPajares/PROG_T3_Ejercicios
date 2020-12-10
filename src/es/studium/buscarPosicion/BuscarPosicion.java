package es.studium.buscarPosicion;

/*
Buscar posición- Realizar un programa que lea una frase y un carácter y muestre
la primera posición donde aparece dicho carácter por primera vez.
 */

import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		String frase; 
		char caracterBuscado; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba una cadena de caracteres: ");
		frase = teclado.nextLine(); 
		
		System.out.println("Indique el caracter que se debe buscar en la cadena anterior: ");
		caracterBuscado = teclado.nextLine().charAt(0); 
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)==caracterBuscado) {
				System.out.println("El caracter buscado esta en la posicion " + i);
			}
		}
		
		teclado.close();
	}

}
