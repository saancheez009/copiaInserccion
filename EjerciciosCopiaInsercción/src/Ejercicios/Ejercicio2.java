package Ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		int  tabla[]=new int [20];
		int  tabla2[]=new int [20];
		int par=0;
		int impar=tabla.length-1;
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=(int) (Math.random ()*100+1);
			
			if(tabla [i]%2==0) {
				tabla2[par]=tabla[i];
				par++;
			} else {
				tabla2[impar]=tabla[i];
				impar--;
			}
		}
		
		tabla=tabla2;
		
		System.out.println(Arrays.toString(tabla));
	}

}
