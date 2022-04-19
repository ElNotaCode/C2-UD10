package ej5;

import java.util.Random;

//Autor Eloi Martorell Martin 13/04/2022

public class Password {
	
	private int longitud;
	//se ha refactorizado respecto al ejercicio anterior por la ñ
	private String password;
	
	//Por defecto long sera de 8
	private int LONGITUD = 8;
	
	//por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.password = generarPassword(longitud);
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		
		this.password = generarPassword(longitud);
		
	}

	String getPassword() { //default para que lo vea el package
		return password;
	}
	
	String generarPassword(int longitud) { //default para que lo vea el package
		
		String passwordAleatoria[] = new String[longitud];
		String password = new String();
		Random r = new Random();
		
		//ampliado por el ejercicio 5 de la TA 10
		for (int i = 0; i < longitud; i++) {
			if(r.nextBoolean()) {
				if(r.nextBoolean()) {
					passwordAleatoria[i] = (char)(r.nextInt(26) + 'a') + "";
				}else {
					passwordAleatoria[i] = ((char)(r.nextInt(26) + 'a') + "").toUpperCase();
				}
			}else {
				passwordAleatoria[i] = r.nextInt(10)+"";
			}
			
			password += passwordAleatoria[i] + "";
		}
			
		return password;
		
	}
	
	int UPPER = 2;
	int LOWER = 1;
	int NUMBERS = 5;
	
	//bool si es fuerte o no, es fuerte si tiene mas de 2 Myus mas de una minus y 5 numeros
	boolean esFuerte() {
		
		String passwordReviewer = password;
		int contadorUpper = 0;
		int contadorLower = 0;
		int contadorNumbers = 0;
		//quitamos los numeros
		passwordReviewer = password.replaceAll("[^\\d]", "");
		//buscamos dos mayusculas;
		for (int i = 0; i < passwordReviewer.length(); i++) {
			if (passwordReviewer.toUpperCase().charAt(i) == passwordReviewer.charAt(i)) {
				contadorUpper++;
			}
		}
		
		for (int i = 0; i < passwordReviewer.length(); i++) {
			if (passwordReviewer.toLowerCase().charAt(i) == passwordReviewer.charAt(i)) {
				contadorLower++;
			}
		}
		
		passwordReviewer = password.replaceAll("[^A-Za-z]", "");
		
		if(contadorUpper > UPPER && contadorLower > LOWER && passwordReviewer.length() > NUMBERS) {
			return true;
		}else {
			return false;
		}
		
	}

}
