package com.ipartek.formacion.javalibro.pojo;

public class LibroPapel extends Libro {
	
	
	private boolean tapaBlanda;
	
	public static final float COSTE_TAPA_DURA = 1.5f;
	
	public LibroPapel(String titulo) {
		super(titulo);
		this.tapaBlanda = true;
	}

	public boolean isTapaBlanda() {
		return tapaBlanda;
	}

	public void setTapaBlanda(boolean tapaBlanda) {
		this.tapaBlanda = tapaBlanda;
	}

	@Override
	public String toString() {
		return super.toString() + " LibroPapel [tapaBlanda=" + tapaBlanda + "]";
	}

	@Override
	public float getPrecio() {		
		return (this.isTapaBlanda()) ? super.getPrecio() : super.getPrecio() + COSTE_TAPA_DURA;
	}
	
	

}
