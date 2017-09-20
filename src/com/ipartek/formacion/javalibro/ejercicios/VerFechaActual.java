package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Mostrar la fecha actual del sistema
 * @author ur00
 *
 */
public class VerFechaActual {

	public static void main(String[] args) {
		
		final String[] DIAS_SEMANA = {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
		
		final String[] MESES = {  "Enero",
									"Febrero",
									"Marzo",
									"Abril",
									"Mayo",
									"Junio",
									"Julio",
									"Agosto",
									"Septiembre",
									"Octubre",
									"Noviembre",
									"Diciembre"};
		
		
		
		
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		
		
		int anyo = gc.get(Calendar.YEAR);
		int mes  = gc.get(Calendar.MONTH);
		int dia  = gc.get(Calendar.DAY_OF_MONTH);
		int diaSemana = gc.get(Calendar.DAY_OF_WEEK)-1;
		
		
		System.out.println( anyo + " " + MESES[mes] + " " + " " + dia + " " + DIAS_SEMANA[diaSemana]);
				
		

	}

}
