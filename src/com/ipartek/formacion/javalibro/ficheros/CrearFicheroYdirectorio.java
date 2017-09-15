package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Pide por pantalla:
 * <ol>
 * <li>Nombre de un directorio</li>
 * <li>Nombre fichero.txt</li>
 * <li>Palabras a guardar dentro del fichero.txt</li>
 * </ol>
 * 
 * Crea la carpeta en C:
 * 
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		Scanner sc = null; 
		String directorio;
		String fichero;
		String contenido;
		String opcion = "n"; 

		try {
			
			sc = new Scanner(System.in);
			
			System.out.println("Introduce nombre del directorio: ");
			directorio = sc.nextLine();

			//Directorio
			File carpeta = new File("c:\\" + directorio);
			if (carpeta.exists()) {
				System.out.println("La carpeta ya existe");
			} else {
				if (carpeta.mkdir()) { 
					System.out.println("Directorio creado con exito");	
				}else {
					System.out.println("ERROR Directorio NO creado");
				}
				
			}

			//fichero
			System.out.println("Introduce nombre del fichero (sin extension .txt): ");
			fichero = sc.nextLine();

			File file = new File(carpeta + "\\" + fichero + ".txt");
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Fichero creado con exito");
			}else {
				System.out.println("Ya existia el fichero");
			}

			//escritura dentro del fichero
			//usamos "file.getAbsoluteFile()" para que no machaque el fichero
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);

			do {
				System.out.println("Introduce texto: ");
				contenido = sc.nextLine();
				bw.write(contenido + "\r\n"); // "\r" retorno de carro y "\n" salto de linea
				System.out.println("Desea introducir mas datos (pulsa n, para salir)");
				opcion = sc.nextLine();
			} while ( !"n".equalsIgnoreCase(opcion) );

			System.out.println("Fichero creado con exito");

		} catch (IOException e) {
			System.out.println("No se puede escribir en el fichero");
			e.printStackTrace();
		} finally {

			try {
				sc.close();
				bw.close();
				fw.close();
			} catch (IOException e) {
				System.out.println("No se puede cerrar el Buffer y Writer");
				e.printStackTrace();
			}
		}

	}

}
