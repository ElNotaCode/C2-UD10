package ej4;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculadora.Calculadora;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Ej4App {

	static Scanner sc = new Scanner(System.in);
	static Calculadora c = new Calculadora();
	static boolean salir = false;
	
	public static void main(String[] args) {

		
		
		//bucle
		do {
			//try catch con excepciones
			try {
				menu();
				
			} catch (InputMismatchException e) {
				System.out.println();
				System.out.println("Se ha introducido un valor incorrecto.");
				System.out.println();
				sc.next();
			}
		}while(!salir);
		sc.close();
		
	}
	
	public static void menu() {
		System.out.println("1 Sumar - 2 Restar - 3 Multiplicar - 4 Dividir - 5 Potencia - "
				+ "6 Raiz cuadrada - 7 Raiz cubica - 0 Salir");
		int elegir =  sc.nextInt();
		switch (elegir) {
		case 1:
			pedirXY(c);
			System.out.println(c.sumar());
			break;
		case 2:
			pedirXY(c);
			System.out.println(c.restar());
			break;
		case 3:
			pedirXY(c);
			System.out.println(c.multiplicar());
			break;
		case 4:
			pedirXY(c);
			System.out.println(c.dividir());
			break;
		case 5:
			pedirXY(c);
			System.out.println(c.potencia());
			break;
		case 6:
			pedirX(c);
			System.out.println(c.raizCuadrada());
			break;
		case 7:
			pedirX(c);
			System.out.println(c.raizCubica());
			break;
		case 0:
			salir = true;
			break;
		default:
			System.out.println("Introduce una opción válida");
			break;
		}
	}
	
	public static Calculadora pedirXY(Calculadora c) {
		
		System.out.println("Introduce X:");
		c.setX(sc.nextDouble());
		System.out.println("Introduce Y:");
		c.setY(sc.nextDouble());
		
		return c;
	}
	
	public static Calculadora pedirX(Calculadora c) {
		
		System.out.println("Introduce X:");
		c.setX(sc.nextDouble());
		
		return c;
	}

}
