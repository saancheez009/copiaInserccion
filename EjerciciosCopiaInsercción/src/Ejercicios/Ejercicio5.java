package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
	
		public static void main(String[] args) {
			
			int tablaEnteros []= new int[10];
			int numPares[] = new int[0];
			int par=0;
			int numImpares[] = new int[0];
			int impar=0;
			
			Scanner sc = new Scanner(System.in);

			for(int i=0; i<tablaEnteros.length;i++) {
				System.out.println("Por favor introduzca 10 números");
				tablaEnteros[i]=sc.nextInt();
				
				//Introducimos un  if para saber si es par o no 
				if(tablaEnteros [i]%2==0) {
					
					//El arrays copy of sirve para poder añadir posiciones en caso de que la longitud sea  menor, en este caso es cero
					//y para poder añadir los números pares que son x, pues añadimos una posicion por cada número, se mostrará asi
					//la tabla solo con los números pares y sin posiciones de más.
					numPares=Arrays.copyOf(numPares,numPares.length+1);
					
					numPares[par]=tablaEnteros[i];
					par++;
				} else {
					
					numImpares=Arrays.copyOf(numImpares,numImpares.length+1);
					
					numImpares[impar]=tablaEnteros[i];
					impar++;
				}
			
			}
			//Mostramos la tabla inicial
			System.out.println(Arrays.toString(tablaEnteros));
			
			
			System.out.println(Arrays.toString(numPares));
			System.out.println(Arrays.toString(numImpares));
		}

	}

