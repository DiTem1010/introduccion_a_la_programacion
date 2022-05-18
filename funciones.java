package com.open_bootcamp;

public class actividad_coche {
	
	public static int asientos(int y1, int y2, int y3) // 1.-Creacion de funciones
	{
		
		int resultado;
		resultado = y1 + y2 + y3;
		return resultado;
		
	}

	public int puerta_sin_usar;
	
	public static void main(String[] args) //funcion main
	{
		// 2.-Llamando a la funcion main.
		
		int puerta_sin_usar; 
		actividad_coche miCoche = new actividad_coche(); //6.Creacion de objeto miCoche.
		miCoche.puerta_sin_usar=0; //es la puerta que se añade
		int estaPuerta;
		estaPuerta = miCoche.puerta_sin_usar;
		estaPuerta = 2;
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("	Se finalizó la construccion de puertas en un vehiculo Minivan");
		System.out.println("	La cantidad de puertas que tiene el vehiculo son: "+  asientos(1,1,1));
		System.out.println("	Se han agregado las puertas del conductor y del copiloto que son: " + estaPuerta);
		System.out.println("	Se agregó una puerta en la parte trasera del vehiculo que son: " + n_puertas(1,2,3));
		System.out.println("	En total son: 6 puertas.");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");

		
	}
	public static int n_puertas (int x1, int x2, int x3) {
 		// 5.- Funcion que incrementa numero de puerta
 		Coche interior = new Coche();
 		
 		
		interior.puerta1 = 1;
 		interior.puerta2 = 0;
 		interior.puerta3 = 0;
 		x1 = interior.puerta1;
 		x2 = interior.puerta2;
 		x3 = interior.puerta3;
 		int cantidadp;
 		
 		return cantidadp = x1 + x2 + x3;
 		
	}
}
	
	// 3.Crear clase Coche
	 class Coche { 
		// 4.- Crear variables numericas que tengan puerta
		
		int puerta1, puerta2 , puerta3 ;
		
	}
