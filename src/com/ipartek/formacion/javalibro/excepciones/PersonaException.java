package com.ipartek.formacion.javalibro.excepciones;

public class PersonaException extends Exception {

	private static final long serialVersionUID = 1L;

	public final static String MSG_EDAD_MENOR = "Debe ser mayor que 18";
	public final static String MSG_EMAIL_ERROR = "Email no es correcto";
	public final static String MSG_DNI_ERROR = "Dni no es correcto";
	
	public PersonaException(String messageException) {
		super(messageException);
	}

}
