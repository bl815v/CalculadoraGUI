package co.edu.udistrital.model;

public class Operaciones {

	public static int sumar(int a, int b) {
		return (a + b);
	}
	
	public static int restar(int a, int b) {
		return (a - b);
	}
	
	public static int multiplicar(int a, int b) {
		return (a * b);
	}
	
	public static double dividir(int a, int b) throws DivisionException{
		if(b==0)
			throw new DivisionException();
		
		return ((double)a / (double)b);
	}
}
