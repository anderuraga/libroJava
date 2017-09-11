package com.ipartek.formacion.javalibro.ejercicios;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.javalibro.pojo.Cancion;

public class MenuCanciones {

	static Scanner sc;
	static ArrayList<Cancion> canciones;
	static final int OP_LISTAR = 1;
	static final int OP_ELIMINAR = 2;
	static final int OP_CREAR = 3;
	static final int OP_DETALLE = 4;
	static final int OP_SALIR = 5;
	
	static int opcionSeleccionada = 1;
	
	public static void main(String[] args) {
	
		inicializarCanciones();		
		mostrarMenu();
		
		do {
						
			pedirOpcion();			
			switch (opcionSeleccionada) {
			case OP_LISTAR:
				listar();
				mostrarMenu();
				break;
				
			case OP_ELIMINAR:
				eliminar();
				listar();
				mostrarMenu();
				break;
			
			case OP_CREAR:
				crear();
				mostrarMenu();
				break;
				
			case OP_DETALLE:
				detalle();
				mostrarMenu();
				break;
	
			default:
				break;
			}
		
		}while( OP_SALIR != opcionSeleccionada );
		
		System.out.println("Agur y gracias por escucharnos");
	}

	private static void crear() {
		sc = new Scanner(System.in);
		System.out.println("Nombre de la cancion");
		String nombre = sc.nextLine();
		
		System.out.println("Artista de la cancion");
		String artista = sc.nextLine();
		
		System.out.println("Duracion de la cancion");
		String duracion = sc.nextLine();
		
		Cancion c = new Cancion(nombre, artista, duracion);
		canciones.add(c);
		
	}

	private static void detalle() {
		System.out.println("Dime el numero de cancion para ver su detalle");
		sc = new Scanner(System.in);
		int cancionPosicion = sc.nextInt();
		cancionPosicion--;
		if ( cancionPosicion >= 0 &&  cancionPosicion <= canciones.size() ) {
			Cancion c = canciones.get(cancionPosicion);
			System.out.println( "Nombre: " + c.getNombre());
			System.out.println( "Artista: " + c.getArtista());
			System.out.println( "Duracion" + c.getDuracion());
			System.out.println(" ");
			
		}else {
			System.out.println("Lo siento pero no existe esa cancion");
		}
		
	}

	private static void eliminar() {
		
		System.out.println("Dime el numero de cancion a eliminar");
		sc = new Scanner(System.in);
		int cancionPosicionEliminar = sc.nextInt();
		cancionPosicionEliminar--;
		
		//comprobar que exista la cancion
		if ( cancionPosicionEliminar >= 0 &&  cancionPosicionEliminar <= canciones.size() ) {
			
			canciones.remove(cancionPosicionEliminar);
			
		}else {
			System.out.println("Lo siento pero no existe esa cancion");
		}
		
	}

	private static void listar() {
		
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println( (i+1) + " " + canciones.get(i).getNombre() );
		}
		
	}

	private static void pedirOpcion() {
		sc = new Scanner(System.in);
		boolean opcionCorrecta = false;
	
			do {
				try {					
					opcionSeleccionada = sc.nextInt();
					if ( opcionSeleccionada >= 1 && opcionSeleccionada <= 5) {
						opcionCorrecta = true;
					}else {
						System.out.println("Por favor aprende a leer y dime una opcion entre 1 y 5");
					}	
				}catch (Exception e) {
					System.out.println("Por favor selecciona una opcion valida");
				}		
				
			}while( !opcionCorrecta );	
		
			
	}

	private static void mostrarMenu() {

		System.out.println("Gestor Canciones");
		System.out.println("---------------------------");
		System.out.println(" 1. Listar ");
		System.out.println(" 2. Eliminar ");
		System.out.println(" 3. Crear ");
		System.out.println(" 4. Detalle ");
		System.out.println(" 5. Salir ");
		System.out.println("---------------------------");
		System.out.println("Selecciona una opcion del 1 al 5");
		
	}

	private static void inicializarCanciones() {
		
		canciones = new ArrayList<Cancion>();		
		for (int i = 0; i < 10; i++) {
			canciones.add(new Cancion("Fiesta Pagana" + i, "Mafo de Hoz" + i , "3:3" + i));	
		}
		
	}

}
