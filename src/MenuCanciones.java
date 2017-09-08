import java.util.ArrayList;

public class MenuCanciones {

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
			
		//TODO hacer el resto de opciones	

		default:
			break;
		}
		
		
		
		
	}

	private static void eliminar() {
		// TODO Auto-generated method stub
		
	}

	private static void listar() {
		// TODO Auto-generated method stub
		
	}

	private static void pedirOpcion() {
		// TODO Scanner y gestion de Excepcion
		opcionSeleccionada = 1;
		
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
