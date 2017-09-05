
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		String [] alumnos = { "Arkaitz",
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
