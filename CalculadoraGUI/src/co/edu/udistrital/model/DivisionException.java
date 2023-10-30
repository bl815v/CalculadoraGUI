package co.edu.udistrital.model;

public class DivisionException extends Exception{
	public DivisionException() {
		super("Error, no se puede dividir entre 0");
	}
	
	public DivisionException(String excep) {
		super(excep);
			
	}
}
