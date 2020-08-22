package Exceptions;

public class IdNumberException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IdNumberException(String id) {
		super("Este cliente no puede entrar, porque el penultimo digito de su identificacion no puede entrar hoy: " + id);
		
	}
}
