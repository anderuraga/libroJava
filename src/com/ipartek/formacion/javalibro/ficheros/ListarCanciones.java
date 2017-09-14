package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

/**
 * Listar todas las canciones de la carpeta c:desarrollo/Music <br>
 * Si no exista la carpeta crearla y meter musica.
 * 
 * 
 * @author ur00
 *
 */
public class ListarCanciones {

	/**
	 * funcion recursiva para recorrer directorios
	 * @see http://lineadecodigo.com/java/listar-un-directorio-de-forma-recursiva-en-java/
	 * @param directorio
	 * @param separador
	 */
	public static void listarDirectorio(File directorio, String separador) {

		File[] ficheros = directorio.listFiles();
		for (int x = 0; x < ficheros.length; x++) {
			System.out.println(separador + ficheros[x].getName());
			if (ficheros[x].isDirectory()) {				
				listarDirectorio(ficheros[x], separador + separador );
			}
		}
	}

	public static void main(String[] args) {

		File f = new File("c:\\desarrollo\\Music");
		listarDirectorio(f, "----");
		
		/*
		 * No funciona si es compleja la estructura de carpetas Hay que hacerlo mediante
		 * una funcion recursiva
		 * 
		 * File f = new File("c:\\desarrollo\\Music"); File[] carpetas = f.listFiles();
		 * System.out.println("Listado canciones");
		 * System.out.println("----------------------");
		 * 
		 * for ( File c : carpetas ) { File[] canciones = c.listFiles();
		 * System.out.println( "[" + canciones.length + "] " + c.getName());
		 * 
		 * for( File cancion : canciones) { System.out.println("    " +
		 * cancion.getName() + " " + (cancion.length()/1024) + " Kb" ); } }
		 */

		

	}

}
