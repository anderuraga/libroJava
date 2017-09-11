package com.ipartek.formacion.javalibro.utilidades;
import junit.framework.TestCase;

public class UtilidadesStringTest extends TestCase {

	public void testBuscarPalabra() {

		// casos null
		
		assertEquals(0, UtilidadesString.buscarPalabra(null, null));
		assertEquals(0, UtilidadesString.buscarPalabra(null, "descanso"));
		assertEquals(0, UtilidadesString.buscarPalabra("Ahora toca descanso", null));
		

		// caso facil		
		assertEquals(1, UtilidadesString.buscarPalabra("Ahora toca descanso", "descanso"));
		assertEquals(1, UtilidadesString.buscarPalabra("Ahora toca descanso.", "descanso"));
		assertEquals(2, UtilidadesString.buscarPalabra("Ahora toca descanso descanso", "descanso"));		
		assertEquals(2, UtilidadesString.buscarPalabra("Ahora toca descansodescanso", "descanso"));
		assertEquals(1, UtilidadesString.buscarPalabra("Ahora toca Adescanso", "descanso"));

			
		
		
	}

}
