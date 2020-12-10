package es.studium.quitarEspacios;

import java.util.Scanner;

/*Quitar espacios - Realizar un programa que lea una cadena por teclado y
obtenga la misma cadena, pero sin espacios.*/

public class QuitarEspacios
{

	public static void main(String[] args)
	{
		//VARIABLES
		String frase; 
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedir cadena
		System.out.println("Escriba una frase: ");
		frase = teclado.nextLine(); 
		teclado.close();
		
		//Quitar los espacios en blanco
		System.out.println(frase.replace(" ",""));
		
		
	}

}
