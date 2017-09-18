package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class LibroElectronico extends Libro {

	private int tamanyo;   /* MegaBytes */
	public static final float DESCUENTO_NO_IMPRESION = 5.0f;
	
	public LibroElectronico(String titulo) {
		super(titulo);	
		this.tamanyo = 0;		
	}

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}

	@Override
	public String toString() {
		return super.toString() + " LibroElectronico [tamanyo=" + tamanyo + "]";
	}

	@Override
	public float getPrecio() {
		float resul = super.getPrecio();
		if ( resul > DESCUENTO_NO_IMPRESION ) {
			resul -= DESCUENTO_NO_IMPRESION;
		}		
		return resul;
	}
	
}
