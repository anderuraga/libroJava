package com.ipartek.formacion.javalibro.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		
		// compilamos el patron
		Pattern patron = Pattern.compile("a*b");
		// creamos el Matcher a partir del patron, la cadena como parametro
		Matcher encaja = patron.matcher("aabmanoloaabmanoloabmanolob");
		
		// invocamos el metodo replaceAll
		String resultado = encaja.replaceAll("-");
		System.out.println(resultado);
		
		
		
		
		patron = Pattern.compile("[abc]{1,5}");
		encaja = patron.matcher("bcabbbbb");
		
		if ( encaja.matches() ) {
			System.out.println("Cadena encajada o correcta");
		}else {
			System.out.println("NO encaja");
		}
		
		

	}

}
