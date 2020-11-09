package es.studium.aaaejemploTabla;

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

public class EjemploTabla{

	
	public static void main(String[] args)
	{
		//final significa constante
		final int TAM = 10;
		
		int i; 
		int tabla[] = new int[TAM];
		
		for(i=0;i<TAM;i++)
		{ 
			tabla[i] = i;
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println(tabla[i]);
		}

	}

}
