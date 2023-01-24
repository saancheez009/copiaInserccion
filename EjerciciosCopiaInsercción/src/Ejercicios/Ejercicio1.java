package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tabla []= new  int [15];
		int  tabla2[]=new int [15];
		int num=0;
		int fin=tabla.length-1;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<tabla.length;i++) {
			System.out.println("Por favor introduzca 15 números");
			tabla[i]=sc.nextInt();
			
		}
		
		
	 System.arraycopy(tabla, 0, tabla2, 1, 14);
	 tabla2[0]=tabla [tabla.length-1];
	 tabla=tabla2;
	 System.out.println(Arrays.toString(tabla));
}

}
