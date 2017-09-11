package com.ipartek.formacion.javalibro.excepciones;

public class PropagarExcepciones {

	public static void main(String[] args) throws Exception {
		
		comoMarron();
		
	}
	
	
	private static void lanzoExcepcion() throws Exception {
		System.out.println("lanzoExcepcion ENTRO");
		throw new Exception();
		//System.out.println("lanzoExcepcion SALGO");
	}
	
	private static void pasoMarron() throws Exception {
		System.out.println("pasoMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");
	}
	
	private static void comoMarron() throws Exception {
		System.out.println("comoMarron ENTRO");
		pasoMarron();
		/*
		try {
			pasoMarron();
		} catch (Exception e) {
			System.out.println("YA me encargo yo de gestionar la Excepcion");			
		}
		*/
		System.out.println("comoMarron SALGO");
	}
	
	

}
