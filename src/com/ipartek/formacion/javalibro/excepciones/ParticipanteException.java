package com.ipartek.formacion.javalibro.excepciones;
/**
 * Exception personalizada para el POJO de Participante
 * @see https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 * @author ur00
 *
 */
public class ParticipanteException extends Exception {

	
	private static final long serialVersionUID = -3514779290734173581L;
	
	public final static String EXCEPTION_MENOR_CERO = "La edad no puede ser menor que 0";
	public final static String EXCEPTION_MAYOR_CIEN = "Eres demasiado viejo, no puedes tener mas de 100 años";
	
	public ParticipanteException(String messageException) {
		super(messageException);
	}

	
}
