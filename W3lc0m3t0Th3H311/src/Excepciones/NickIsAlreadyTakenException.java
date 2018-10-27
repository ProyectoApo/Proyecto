package Excepciones;

public class NickIsAlreadyTakenException extends Exception {
	
	public NickIsAlreadyTakenException(String nick) {
		super("El nickname: " +nick+ " ya esta registrado, por favor favor intente con otro" );
	}



}
