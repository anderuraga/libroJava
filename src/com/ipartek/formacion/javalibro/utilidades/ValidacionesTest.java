package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {

		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("auraga.ipartek.com"));
		assertFalse(Validaciones.email("auraga.ipartek."));
		assertFalse(Validaciones.email("auraga@"));
		assertFalse(Validaciones.email("auraga@ipartekcom"));
		assertFalse(Validaciones.email("auraga@ipartekcom.e"));

		assertTrue(Validaciones.email("auraga@ipartek.com"));

	}

}
