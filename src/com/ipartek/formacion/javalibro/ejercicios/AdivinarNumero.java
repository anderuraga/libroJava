package com.ipartek.formacion.javalibro.ejercicios;
import java.util.Scanner;

public class AdivinarNumero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numAleatorio = (int) (Math.random() * 10) + 0;
		int intentos = 3;

		
		boolean esNumero = false;
		boolean juegoGanado = false;

		System.out.println("Juego de adivinar un numero del 1 al 10, tres intentos.");
		System.out.println("*numero secreto es = " + numAleatorio);
		int numRespuesta = 0;
		
		do {

			do {
				try {
					sc = new Scanner(System.in);
					numRespuesta = sc.nextInt();
					esNumero = true;
				} catch (Exception e) {
					System.out.println("Introduce un numero.");
				}
			} while (!esNumero);

			if (numRespuesta == numAleatorio) {
				juegoGanado = true;
			}

			if (intentos > 1 && juegoGanado == false) {
				intentos--;
				System.out.println("Te quedan " + intentos + " intentos.");
				System.out.println("Introduce un numero del 1-10");
			} else if (juegoGanado == true) {
				System.out.println("Has ganado el juego.");
			} else {
				System.out.println("Has perdido.");
			}

		} while (intentos > 0 && juegoGanado == false);

		sc.close();

	}
}
