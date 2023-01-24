package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int tablaEnteros []= new int[10];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<tablaEnteros.length;i++) {
			System.out.println("Por favor introduzca 10 números");
			tablaEnteros[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(tablaEnteros));
	}

}
