package calculadora;

//@Author ElNotaCode (Eloi Martorell) 19/04/2022

public class Calculadora {
	
	double x;
	double y;
	
	public Calculadora() {
	}
	
	public Calculadora(int x) {
		this.x = x;
	}
	
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double sumar() {
		return (x+y);
	}
	
	public double restar() {
		return (x-y);
	}
	
	public double multiplicar(){
		return (x*y);
	}
	
	public double dividir(){
		return (x/y);
	}
	
	public double potencia(){
		return (Math.pow(x, y));
	}
	
	public double raizCuadrada(){
		return (Math.sqrt(x));
	}
	
	public double raizCubica(){
		return (Math.cbrt(x));
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	

}
