package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int tabla[]= new int[10];
		int tabla2[]=new int[10];
		int v;
		int p;
		String letra ;
		
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que seleccione una opción
		System.out.println("Por favor seleccione una opción:");
		
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valor");
		System.out.println("c. Salir");


		letra = sc.next();
		
		switch (letra) {
		case "a":
			for(int i=0; i<tabla.length; i++) {
				tabla[i]=(int) (Math.random ()*100+1);
				
			}
			System.out.println(Arrays.toString(tabla));
			break;
			
		case "b":
			
			System.out.println("Por favor introduzca un valor V");
			v=sc.nextInt();
			System.out.println("Por favor introduzca una posición P");
			p=sc.nextInt();
			
			tabla[p]=v;
			System.out.println(Arrays.toString(tabla));
			
			break;
			
		case "c":
		
			break;
		
		
		}
	}

}
