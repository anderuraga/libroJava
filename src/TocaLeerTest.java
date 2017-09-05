import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGenerarNumeroAleatorio() {
		
		int numAleatorio = -1;
		boolean [] aChek = new boolean[15];
		
		for (int i = 0; i < 1000 ; i++) {
		
			numAleatorio = TocaLeer.generarNumeroAleatorio(15);
			aChek[numAleatorio] = true;
			
		}
		
		//comprobar que todas las posiciones sean true
		for (int i = 0; i < aChek.length; i++) {
			assertTrue("deberia haber salido el numero " + i ,aChek[i]);
		}
		
	}

}
