package com.ipartek.formacion.javalibro.pojo;

public class LibrosRecomendados {

	public static void main(String[] args) {
		
		
		Libro l = new Libro("100 años de soledad");
		l.setAutor("Gabriel Garcia");
		l.setPaginas(307);
		
		LibroElectronico le = new LibroElectronico("Años salvajes");
		le.setAutor("William Finnegan");
		le.setTamanyo(23);
		le.setPaginas(523);
		

		LibroPapel lp = new LibroPapel("PAPILLÓN");
		lp.setAutor("CHARRIERE, HENRI");
		lp.setTapaBlanda(false);
		lp.setPaginas(789);
		
		System.out.println(l);
		System.out.println(le);
		System.out.println(lp);
		
		
		
		le.imprimir();
		
	}

}
