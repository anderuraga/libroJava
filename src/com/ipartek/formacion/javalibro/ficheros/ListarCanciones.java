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

	
	public static void main(String[] args) {
		
		File f = new File("c:\\desarrollo\\Music");
		File[] carpetas = f.listFiles();
		System.out.println("Listado canciones");
		System.out.println("----------------------");
		
		for ( File c : carpetas ) {
			File[] canciones = c.listFiles();
			System.out.println( "[" + canciones.length + "] " + c.getName());
			
			for( File cancion : canciones) {
				System.out.println("    " + cancion.getName() + " " + (cancion.length()/1024) + " Kb" );
			}
		}
		

	}

}
