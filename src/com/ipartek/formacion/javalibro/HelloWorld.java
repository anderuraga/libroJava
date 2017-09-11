package com.ipartek.formacion.javalibro;

public class HelloWorld {

	final int DIAS_SEMANA = 7;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		//Cambio tonto para pusher y que vosotros lo bajeis
		
		String [] alumnos = { 
				                "Ander",   
				                "Arkaitz",
				                "Erlantz",
				                "Fran",
				                "Cristian",
				                "Leire" ,
				                "Mikel",
				                "Josu",
				                "Alberto",
				                "Jon",
				                "Lander",
				                "German"
				              };
		
		System.out.println("--------- Listado Alumn@s ---------------");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println( i + " - " + alumnos[i] );
		}
		
		
		

	}

}
