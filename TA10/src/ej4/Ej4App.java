package ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Ej4App {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		boolean salir = false;
		//bucle
		do {
			//try catch con excepciones
			try {
				menu();
				
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("Se ha introducido un valor no numerico.");
				System.out.println();
				sc.next();
			}
		}while(!salir);
		sc.close();
		
	}
	
	public static void menu() {
		System.out.println("1 Sumar - 2 Restar - 3 Multiplicar - 4 Dividir - 5 Potencia - "
				+ "6 Raiz cuadrada - 7 Raiz cubica");
		int elegir =  sc.nextInt();
	}

}
