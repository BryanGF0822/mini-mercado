package Exceptions;

public class PruebaException extends Exception{

	public PruebaException(String message) {
		super("tuve un error en : "+message);
	}
	
}
