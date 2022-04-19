package ej2;

import myException.MyException;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Ej2App {

	public static void main(String[] args) {

		try {
			System.out.println("Mensaje mostrado por pantalla.");
			throw new MyException(1);
		} catch (MyException e) {
			// Done: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Programa terminado.");

	}

}
