package myException;

import java.util.Scanner;

public class MyException extends Exception{
	
	//codigo exception
	private int codigoException;
	
	//Constructor de clase
	public MyException(int codigoError) {
		this.codigoException = codigoError;
	}
	
	public MyException() {
		
	}
	
	//Metodo propuo mostrar mensaje customizado
	@Override
	public String getMessage() {
		
		String mensaje = "Exception capturada con mensaje: ";
		
		switch(codigoException) {
		case 1:
			mensaje = "Esto es un objeto Exception.";
			break;
		case 2:
			mensaje = "Es par.";
			break;
		case 3:
			mensaje = "Es impar.";
			break;
		}
		
		return mensaje;
		
	}
	
	public String InputMismatchException(Scanner sc) {
		
		sc.next(); //pasamos el scanner
		return "Se ha introducido un valor no numerico.";
		
	}
	

}
