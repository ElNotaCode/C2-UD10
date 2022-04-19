package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Ej1App {

	public static void main(String[] args) {
		
		//genemarmos el numero
		NumeroAleatorio n = new NumeroAleatorio();
		int numero = 0;
		int intentos = 0;
		//testeo
		//System.out.println(n);
		
		//creamos un bucle
		boolean checkNumero = false;
		Scanner sc = new Scanner(System.in);
		do {
			//try
			try {
				//pedimos el numero
				System.out.println("Introduce un valor entero del 1 al 500:");
				numero = sc.nextInt();
				
				//miramos si es correcto
				if(n.getNumero() == numero) {
					checkNumero = true;
				}else {
					System.out.println("¡Incorrecto!");
					n.setIntentos(++intentos);
				}
				
				//catch
			} catch (InputMismatchException e) {
				// DONE: handle exception
				System.out.println("Tienes que introducir un valor ENTERO!");
				n.setIntentos(++intentos);
				sc.next();//http://www.w3api.com/Java/InputMismatchException/
			}
			
		}while(!checkNumero);
		sc.close();
		
		//fin de la partida
		System.out.println(n);
	}

}
