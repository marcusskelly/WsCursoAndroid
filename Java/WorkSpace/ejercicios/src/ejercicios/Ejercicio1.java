package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Esta función es el punto de inicio de Java5
		
		Scanner sc =new Scanner(System.in);
		int numero = 0;
		System.out.println("introduzca un numero: ");
		//leer numero
		numero = sc.nextInt();//aqui el programa se quedara parado a la espera de que
							// el usuario cree un numero y ponga enter
		for(int i = 1;i<numero;i++) {
			System.out.println(i);
		}
			System.out.println("escoja opción entre 1 y 0");
			if(numero == 1) {
				System.out.println("Introduzca otro numero");
				numero = sc.nextInt();
			}else if(numero == 0){
	            System.out.println("El programa ha acabado");
			}
        
		
		
		
		
		
	}
}
