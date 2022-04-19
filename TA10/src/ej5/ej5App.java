package ej5;

import java.util.Scanner;

public class ej5App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de contraseñas a generar:");
		int n = sc.nextInt();
		Password passwords[] = new Password[n];
		boolean esFuerte[] = new boolean[n];
		System.out.println("Introduce la longitud de las passwords:");
		n = sc.nextInt();
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i] = new Password(n);
			esFuerte[i] = passwords[i].esFuerte();
			System.out.println(passwords[i].getPassword() + " " + esFuerte[i]);
		}
	}

}
