package ej1;

import java.util.Random;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class NumeroAleatorio {

	//va a tener un numero y un numero de intentos
	int numero;
	int intentos;
	
	//va a tener unas constantes MIN Y MAX
	int MIN = 1;
	int MAX = 500;
	
	//va a tener un constructor por defecto donde se genera el numero mediante metodo y intentos se queda en 0;
	public NumeroAleatorio() {
		this.numero = generarNumero();
		this.intentos = 0;
	}
	
	//apliado por el ej3 constructor que nos permite generar de nuevo las variables
	public NumeroAleatorio(int min, int max) {
		this.MIN = min;
		this.MAX = max;
		this.numero = generarNumero();
		this.intentos = 0;
	}
	
	//va a tener un metodo para hacer random el numero
	private int generarNumero() {
		
		Random r = new Random();
		return (r.nextInt(MAX)+MIN);
	}

	//to string personalizado
	
	@Override
	public String toString() {
		return "El numero generado es " + numero + ", te ha llevado " + intentos + " intentos.";
	}

	//getter del numero y de los intentos y setter intentos
	
	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public int getNumero() {
		return numero;
	}
	
	//ampliado por el ej3
	public boolean calcularPar() {
		
		if(this.numero%2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
