package Ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int tabla1[]= new int [100];
		int tabla2[]= new int [100];
		int num=100;
		
		for(int i=0;i<tabla1.length;i++) {
			
			tabla1[i]=i+1;
		}
		System.out.println(Arrays.toString(tabla1));
				
		for(int i=0;i<tabla2.length;i++) {
					tabla2[i]=num;
					num--;
		}
		System.out.println(Arrays.toString(tabla2));
		
	}

	
}
