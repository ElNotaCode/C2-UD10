package calculadora;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Calculadora {
	
	public double sumar(double x, double y) {
		return (x+y);
	}
	
	public double restar(double x, double y) {
		return (x-y);
	}
	
	public double multiplicar(double x, double y){
		return (x*y);
	}
	
	public double dividir(double x, double y){
		return (x/y);
	}
	
	public double potencia(double x, double y){
		return (Math.pow(x, y));
	}
	
	public double raizCuadrada(double x){
		return (Math.sqrt(x));
	}
	
	public double raizCubica(double x){
		return (Math.cbrt(x));
		
	}
	
	

}
