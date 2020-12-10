package es.studium.sumaPosicion;

/*Suma posici�n � Realizar un programa que en una tabla de 10x10 guarde en
cada posici�n, la suma de los �ndices de dicha posici�n (fila + columna) y luego
lo muestre por pantalla.
*/

public class SumaPosicion
{

	public static void main(String[] args)
	{
		//VARIABLES
		final int FILAS = 10; 
		final int COLUMNAS = 10; 
		int tabla[][]= new int[FILAS][COLUMNAS];
		int i, j; 
	
		//Rellenar tabla
		for(i=0;i<FILAS;i++) 
		{
			for(j=0;j<COLUMNAS;j++) 
			{
				tabla[i][j] = i+j;
			}
		}
		
		for(i=0;i<FILAS;i++) 
		{
			for(j=0;j<COLUMNAS;j++) 
			{
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
