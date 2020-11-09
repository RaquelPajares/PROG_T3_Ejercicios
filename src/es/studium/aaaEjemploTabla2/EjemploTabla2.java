package es.studium.aaaEjemploTabla2;

import java.util.Scanner;

/* PROGRAMA Ejemplo1Tablas
	 * CONSTANTES
	 * 	ENTERO TAM = 15
	 * VARIABLES
	 * 	ENTERO i
	 * 	ENTERO TABLA[TAM]
	 * INICIO
	 * 	PARA i = 0 HASTA i<TAM HACER
	 * 		ESTRIBIR tabla[i]
	 * 	FIN PARA
	 * FIN
	 */

public class EjemploTabla2{


public static void main(String[] args)
{
	//final significa constante
	final int TAM = 5;
	
	int i; 
	int tabla[] = new int[TAM];
	
	Scanner teclado = new Scanner(System.in);
	
	for(i=0;i<TAM;i++)
	{ 
		System.out.println("Dame el valor de la tabla[" + i + "]");
		tabla[i] = teclado.nextInt();
	}
	
	teclado.close();
	
	for(i=0;i<5;i++)
	{
		System.out.println(tabla[i]);
	}

	
}

}
