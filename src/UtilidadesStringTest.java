import junit.framework.TestCase;

public class UtilidadesStringTest extends TestCase {

	public void testBuscarPalabra() {

		
		//caso facil
		assertEquals(1 , UtilidadesString.buscarPalabra("Ahora toca descanso", "descanso") );
		assertEquals(2 , UtilidadesString.buscarPalabra("Ahora toca descanso descanso", "descanso") );
		assertEquals(0 , UtilidadesString.buscarPalabra("Ahora toca descansodescanso", "descanso") );
		
		//casos null
		assertEquals( 0 , UtilidadesString.buscarPalabra( null , null ) );
		assertEquals( 0 , UtilidadesString.buscarPalabra( null , "descanso" ) );
		assertEquals( 0 , UtilidadesString.buscarPalabra( "Ahora toca descanso" , null ) );
	}

}
