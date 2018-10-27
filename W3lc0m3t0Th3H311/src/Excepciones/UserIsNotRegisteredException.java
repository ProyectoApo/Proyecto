package Excepciones;

public class UserIsNotRegisteredException extends Exception{

	public UserIsNotRegisteredException (String nombre) {
		super("No existe un usuario con este nombre: " +nombre+ "registrado");
	}
}
