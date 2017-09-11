package com.ipartek.formacion.javalibro.ejercicios;
/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = (float)1326.24;
		float pago = 4 * 500;
		float resto = pago - compra;
		final float[] BILLETES_MONEDAS = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		int[] aVueltas = new int[BILLETES_MONEDAS.length];
		String[] literales = { "Billete 50", "Billete 20", "Billete 10", "Billete 5", "Moneda 2", "Moneda 1",
				"Moneda 0,50", "Moneda 0,20", "Moneda 0,10", "Moneda 0,05", "Moneda 0,02", "Moneda 0,01", }; // calcular
																												// las
																												// vueltas
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			resto = resto - BILLETES_MONEDAS[i] * aVueltas[i];
		}
		
		System.out.println("-------------------------");
		System.out.println("------ TICKET ---------");
		System.out.println("-------------------------");
		System.out.println("PAGO: " + compra + " €");
		System.out.println("RETORNO:" + (pago - compra) + "€");
		System.out.println("-------------------------");
		System.out.println("Las vueltas:");
		System.out.println("-------------------------");
		for (int i = 0; i < aVueltas.length; i++) {
			System.out.println(aVueltas[i] + " " + literales[i]);
		}
		System.out.println("-------------------------");
		System.out.println("-gracias por su visita-");
		System.out.println("-------------------------");
			
		
		
	}

}
