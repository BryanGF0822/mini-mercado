package Exceptions;

public class TarjetaDeIdentidadException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TarjetaDeIdentidadException(String document) {
		super("El cliente no puede ingresar porque es menor de edad, tiene: " + document);
	}
	
}
