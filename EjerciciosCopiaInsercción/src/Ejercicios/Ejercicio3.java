package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	
		static boolean esPrimo (int numero){
			boolean primo=true;
			if(numero==1) {
				primo=false;
			}
			for(int j=2;j<numero;j++) {
				if(numero%j==0) {
					primo =false;
				}
			}
			return(primo);
		}
			public static void main(String[] args) {
				
				int tabla[]=new int[10];
				int tabla2[]=new int[10];
				int primo=0;
				int noPrimo=tabla.length-1;
				
				Scanner sc = new Scanner(System.in);
				
				for(int i=0;i<tabla.length;i++) {
					System.out.println("Por favor introduzca 10 números");
					tabla[i]=sc.nextInt();
					
					if(esPrimo (tabla[i])) {
						tabla2[primo]=tabla[i];
						primo++;
					}else {
						tabla2[noPrimo]=tabla[i];
						noPrimo--;
					}
							
						}
						
					
					
			
					tabla=tabla2;
							
							System.out.println(Arrays.toString(tabla));
			}

		}


