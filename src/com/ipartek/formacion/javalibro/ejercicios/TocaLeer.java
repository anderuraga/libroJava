package com.ipartek.formacion.javalibro.ejercicios;
import com.ipartek.formacion.javalibro.pojo.Participante;

public class TocaLeer {


	Participante [] listaParticipantes = new Participante[alumnos.length];
	static String [] alumnos = { "Arkaitz",
            "Erlantz1",
            "Fran",
            "Cristian",
            "Erlantz2",
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

	static String [] Usugit = { "arkaitzgl",
            "erliglesias",
            "FranPerez92",
            "CristianVar",
            "Erlantzcabrejas",
            "LeireBustin" ,
            "zoroa84",
            "Katakume",
            "amsoria91",
            "alarconsolis",
            "arantxamg",
            "naiaramateos",
            "LanderAB",
            "LordBlacKhiin",
            ""
          };
	
	public static void main(String[] args) {
	
		Participante [] listaParticipantes = new Participante[alumnos.length];
		for (int i = 0; i < alumnos.length; i++) {
			listaParticipantes[i] = new Participante(alumnos[i], Usugit[i]);
		}
		
		int numAleatorio = generarNumeroAleatorio(alumnos.length );					
		
		System.out.println("El afortunad@ es:" + listaParticipantes[numAleatorio].getNombre() + " " + listaParticipantes[numAleatorio].getLinkGitHub() );
		
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
