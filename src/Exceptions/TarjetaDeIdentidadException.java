package Exceptions;

public class TarjetaDeIdentidadException extends Exception{

	public TarjetaDeIdentidadException(String document) {
		super("El cliente no puede ingresar porque es menor de edad, tiene: " + document);
	}
	
}
