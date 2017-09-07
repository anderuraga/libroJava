import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean seguir = false;
		
		System.out.println("Calculadora IVA 21%");
		System.out.println("------------------------");
		
		do {
			System.out.println("Por favor dame el importe en €");
			float importe = sc.nextFloat();		
			System.out.println( "iva repercutido: " + importe * 0.21 );
			System.out.println("¿ Quieres calcular de nuevo ?  (S/N)");
			seguir = "s".equalsIgnoreCase(sc.next());
		}while( seguir );
		
		
		System.out.println("Agur Venur");
		
		
		sc.close();
		
	}

}
