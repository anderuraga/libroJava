package com.ipartek.formacion.javalibro.pojo;

import junit.framework.TestCase;

public class LibroTest extends TestCase {

	public void testPrecio() {

		Libro l = new Libro("100 años de soledad");
		l.setAutor("Gabriel Garcia");
		l.setPaginas(307);		
		assertEquals( 61.4f , l.getPrecio());
		
		LibroElectronico le = new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setPaginas(523);		
		assertEquals( 99.6f , le.getPrecio());
		
		
		LibroPapel lp = new LibroPapel("PAPILLÓN");
		lp.setAutor("CHARRIERE, HENRI");
		lp.setTapaBlanda(false);
		lp.setPaginas(789);
		assertEquals( 159.3f , lp.getPrecio());
		
		lp.setTapaBlanda(true);
		assertEquals( 157.8f , lp.getPrecio());
		
		
		Libro lIncorrecto = new Libro("precio negativo");
		lIncorrecto.setPaginas(-6);
		assertEquals("Paginas negativas, valor precio 0", 0f , lIncorrecto.getPrecio());
		
		
		LibroElectronico lIncorrectoElec = new LibroElectronico("precio negativo");
		lIncorrectoElec.setPaginas(10);		
		assertEquals(2.0f , lIncorrectoElec.getPrecio());
		
		
	}
	
}
