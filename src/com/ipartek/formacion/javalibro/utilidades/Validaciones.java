package com.ipartek.formacion.javalibro.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * Metodo para validar si un email es correcto
	 * @param email a validar
	 * @return true si es valido, false en caso contrario
	 */
	public static boolean email(String email) {
		boolean resul = false;
		if ( email != null ) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
	        resul = matcher.find();
		}
		return resul;
	}
	
	
	/**
	 * Metodo para validar un DNI
	 * @see https://medium.com/@manuelmato/c%C3%B3mo-validar-un-dni-en-java-6d7ce7d764aa
	 * @param dni String Documento Identidad Nacional con 8 digitos y letra ( sin espacios, ni guiones)
	 * @return true si es valido, false en caso contrario
	 */
	static boolean dni(String dni) {
		
		boolean resul = false;
		
		if ( dni != null ) {
			
			String letraMayuscula = ""; //Guardaremos la letra introducida en formato mayúscula
	        
	        // Aquí excluimos cadenas distintas a 9 caracteres que debe tener un dni y también si el último caracter no es una letra
	        if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false ) {
	            return false;
	        }
	 
	         
	        // Al superar la primera restricción, la letra la pasamos a mayúscula
	        letraMayuscula = (dni.substring(8)).toUpperCase();
	 
	        // Por último validamos que sólo tengo 8 dígitos entre los 8 primeros caracteres y que la letra introducida es igual a la de la ecuación
	        // Llamamos a los métodos privados de la clase soloNumeros() y letraDNI()
	        if(soloNumeros(dni) == true && letraDNI(dni).equals(letraMayuscula)) {
	        	resul = true;
	        }	        
		}   
		
		return resul;
	}
	
	
	  private static boolean soloNumeros(String dni) {
		  
          int i, j = 0;
          String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
          String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
          String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

          for(i = 0; i < dni.length() - 1; i++) {
              numero = dni.substring(i, i+1);

              for(j = 0; j < unoNueve.length; j++) {
                  if(numero.equals(unoNueve[j])) {
                      miDNI += unoNueve[j];
                  }
              }
          }

          if(miDNI.length() != 8) {
              return false;
          }
          else {
              return true;
          }
      }

      private static String letraDNI(String dni) {
      // El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

      // pasar miNumero a integer
      int miDNI = Integer.parseInt(dni.substring(0,8));
      int resto = 0;
      String miLetra = "";
      String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

      resto = miDNI % 23;

      miLetra = asignacionLetra[resto];

      return miLetra;
  }

}
