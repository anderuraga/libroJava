
public class TocaLeer {

	static String [] alumnos = { "Arkaitz",
				            "Erlantz",
				            "Fran",
				            "Cristian",
				            "Leire" ,
				            "Mikel",
				            "Josu",
				            "Alberto",
				            "Jon",
				            "Arantza",
				            "Naiara",
				            "Lander",
				            "Yeray",
				            "German"
				          };
	
	
	public static void main(String[] args) {
	
		int numAleatorio = generarNumeroAleatorio(alumnos.length );					
		
		System.out.println("El afortunad@ es:" + alumnos[numAleatorio] );
		
	}
	
	/**
	 * genera numero aleatorio entre 0 y <code>max</code>
	 * @param max int numero maximo que puede generar la funci�n
	 * @return int aleatorio
	 */
	public static int generarNumeroAleatorio( int max ){
		int resul = -1;
		
		resul = (int)(Math.random()*max);
		
		return resul;
	}
	

}
