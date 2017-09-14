package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;

public class ListarVolumenes {

	public static void main(String[] args) {
		
		System.out.println("Volumnes o Unidades de nuestro PC");
		File f = new File("");
		File[] volumnes = f.listRoots();
		for( File v : volumnes ) {
			System.out.println( v );
		}	

	}

}
