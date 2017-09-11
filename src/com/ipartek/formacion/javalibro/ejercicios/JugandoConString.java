package com.ipartek.formacion.javalibro.ejercicios;

public class JugandoConString {

	public static void main(String[] args) {
		
		String manolo = "Manolo Kabezabolo";
		
		//convertir a minusculas
		System.out.println(  manolo.toLowerCase() );
		
		//convertir a mayusculas
		System.out.println(  manolo.toUpperCase() );
		
		//mostrar numero de caracteres
		System.out.println( "tiene " + manolo.length() + " caracteres" );
		
		//mostrar posiscion de la letra "K"
		
		System.out.println( "posicion K " + manolo.indexOf('K') );
		
		//separar en dos variables el nombre y ´apellido' con substring
		String nombre = manolo.substring(0, 6); //Manolo
		String apellido =  manolo.substring(7);// Kabezabolo
		System.out.println("Nombre= " + nombre);
		System.out.println("Apellido= " + apellido);
		
		
		
		/*   Comparando   */
		
		String c1 = "casa";
		String c2 = "Casa";		
		//comparar c1 y c2 con equals y equalIgnoreCase
		
		System.out.println("casa != Casa con equals " + c1.equals(c2) );
		System.out.println("casa == Casa con equalsIgnoreCase " + c1.equalsIgnoreCase(c2) );
		
		/* Limpiando entradas de datos */
		
		String c3 = "perro";
		String c4 = "     perro     ";		
		//las dos variables deden ser igual => trim
		System.out.println("Los dos perros son iguales " + c3.equals(c4.trim()));
		
		
		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed tristique magna non elementum facilisis. Suspendisse ultricies finibus massa, at ullamcorper felis aliquet a. Aliquam gravida volutpat purus nec faucibus. Ut sodales enim ac gravida fermentum. Aenean id est at mauris vehicula tincidunt et sit amet erat. Morbi et tincidunt massa, scelerisque maximus quam. Sed hendrerit fermentum venenatis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin faucibus hendrerit sem. Aliquam erat volutpat. Ut in condimentum eros. Praesent molestie justo quis porta finibus. Etiam laoreet, odio at auctor sodales, arcu arcu finibus ligula, a facilisis elit tellus laoreet turpis. Nulla mattis mattis mi sed aliquet. Duis dignissim commodo vulputate.";
		//mostrar longitud
		//contar palabras
		//contar todas las vocales
		//indicar el numero de veces que aparece 'at'
		
		System.out.println("------- Lorem ------------");
		System.out.println("Longitud " + lorem.length() + " chars" );
		System.out.println("Palabras " + lorem.split(" ").length + " palabras" );
		
		int contadorVocales = 0;
		char [] aVocales = lorem.toLowerCase().toCharArray();
		char vocal = 'a';
		char []vocales = {'a','e','i','o','u'};
		
		for (int i = 0; i < aVocales.length; i++) {
			vocal = aVocales[i];
			
			for (int j = 0; j < vocales.length; j++) {
				if ( vocales[j] == vocal ) {
					contadorVocales ++;
					break;
				}
			}			
			
		}
		System.out.println("Vocales= " + contadorVocales );
		
		
		
	}
	
}
