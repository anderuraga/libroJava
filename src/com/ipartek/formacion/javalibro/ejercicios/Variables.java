package com.ipartek.formacion.javalibro.ejercicios;
import java.text.NumberFormat;

/*
 * Ejercicio para probar las variables de Java
 */
public class Variables {

	/**
	 * obetner un simbolo especial ASCII de 'check' '\u2714' o 'cross' '\u2716'
	 * @param valor boolean
	 * @return si valor true check, si false cross
	 */
	public static char dameSimbolo ( boolean valor ) {
		
		char resul = '\u2716';
		if (valor) {
			resul = '\u2714';
		}
		return resul;
	}
	
	
	public static void main(String[] args) {

		System.out.println("Ejercicio con Variables");

		System.out.println("1. Enteros");
		System.out.println("2. Reales");
		System.out.println("3. Boleanas");
		System.out.println("1. Caracteres");

		System.out.println("Enteros:");

		// TODO terminar de poner el resto
		System.out.println("int " + Integer.BYTES + " bytes entero " + Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

		System.out.println("Reales:");
		float sueldoMesGerman = 1200.23f;
		System.out.println("German cobra " + NumberFormat.getInstance().format(sueldoMesGerman) + " � al mes");

		String sSueldoGerman = String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("German cobra " + sSueldoGerman + " � al mes");

		// TODO declarar una varaible primtiva de cada tipo y usar su Wrapper

		char[] chars = { 'a', 'F', '3', 'j' };
		System.out.println("---------------------------------------------");
		System.out.println("    digito      letra    Mayus.   Minus.");
		for (int i = 0; i < chars.length; i++) {
			System.out.println(    chars[i] + "     " + 
								  dameSimbolo(Character.isDigit(chars[i])) + "    " + 
								  dameSimbolo(Character.isLetter(chars[i]))	+ "    " + 
								  dameSimbolo(Character.isUpperCase(chars[i])) + "    " + 
								  dameSimbolo(Character.isLowerCase(chars[i])) + "    "
					           );
		} // end for

	}

}
