package com.ipartek.formacion.javalibro.ejercicios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean seguir = false;
		float importe = 0;
		boolean importeCorrecto = false;
		
		System.out.println("Calculadora IVA 21%");
		System.out.println("------------------------");
		
		do {
			System.out.println("Por favor dame el importe en €");
			
			//Comprobar que sea un numero
			do {
				try {
					
					//TODO hacer lo que querais pero que pase por las otras excepction
					
					/*
					sc = null;
					sc.next();
					*/
					
					//importe = 9/0;
					
					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto = true;
					
					
					
				}catch (NullPointerException e) {
					System.out.println("Ya me diras como has metido un null :-O");
				}catch (InputMismatchException e) {
					System.out.println("Valor incorrecto, introduce un numero, por ejemplo: 123.33 ");				
				}catch (Exception e) {
					System.out.println("¿ Que has hecho para que falle? ");
				}
			}while(!importeCorrecto);	
			
			//Calculo del Iva			
			System.out.println( "iva repercutido: " + importe * 0.21 );
			
			//Repetir la operacion ?
			System.out.println("¿ Quieres calcular de nuevo ?  (S/N)");
			seguir = "s".equalsIgnoreCase(sc.next());
		}while( seguir );
		
		
		System.out.println("Agur Venur");
		
		
		sc.close();
		
	}

}
