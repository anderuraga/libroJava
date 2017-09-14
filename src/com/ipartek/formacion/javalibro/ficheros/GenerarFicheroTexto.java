package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerarFicheroTexto {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("c:\\prueba.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("Yeahhhhhhhhhhh esto escribe");
							
			System.out.println("Fichero creado con exito");
			
			
		} catch (IOException e) {
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		}finally {
			
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y Writer");
				e.printStackTrace();
			}
			
		}
		
	}

}
