package com.ipartek.formacion.javalibro.ejercicios;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;
import com.ipartek.formacion.javalibro.pojo.Participante;

/**
 * Las variables primitivas se pasan por valor
 * Las variables de Clase se pasan por referencia
 * 
 * @author ur00
 *
 */
public class VariablesReferenciaYvalor {

	public static void main(String[] args) throws ParticipanteException {
		
		//Las variables primitivas se pasan por valor
		int primitiva = 1; 
		System.out.println("primitiva = " + primitiva);
		int primitiva2 = sumar(primitiva);
		System.out.println("primitiva = "  + primitiva);
		System.out.println("primitiva2 = " + primitiva2);
		
		
		
		//Las variables de Clase se pasan por referencia
		Participante p1 = new Participante("manolo", 18);
		Participante p2 = sumar(p1);
		System.out.println("referencia= " + p1.getEdad());
		System.out.println("referencia2= " + p2.getEdad());
		
	}
			
	static int sumar( int i ) {
		return ++i;
	}
	
	static Participante sumar(Participante p) throws ParticipanteException {
		p.setEdad( (p.getEdad() + 1) );		
		return p;
	}
	
	
	

}
