package ej3;

import ej1.NumeroAleatorio;
import myException.MyException;

public class Ej3App {

	public static void main(String[] args) throws MyException {
		
			try {
				
				System.out.println("Generando numero aleatorio...");
				NumeroAleatorio n = new NumeroAleatorio(1,999);
				System.out.println("El numero generado es: " + n.getNumero());
				boolean par = n.calcularPar();
				if(par) {
					throw new MyException(2);
				}else {
					throw new MyException(3);
				}
				
			} catch (MyException e) {
				System.out.println(e.getMessage());
			}

	}

}
