package com.ipartek.formacion.javalibro.pojo.interfaces;

import java.io.Serializable;

public interface Vendible extends Serializable, Cloneable {

	
	//Los atributos de una interfaz son siempre static y final
	//static porque solo puede haber 1 en memoria
	//final porque no se pueden modificiar
	/* static final */ float PRECIO_MINIMO = 0;
	
	/**
	 * Retorna el precio del objeto, el cual debe ser superior al PRECIO_MINIMO 
	 * @return
	 */
	float getPrecio();       /* prototipo */ 
	
}
