package com.ipartek.formacion.javalibro.pojo;

/**
 * Una clase abstract puede contener codigo imnplementando, 
 * pero tiene alguun metodo SIN implementar (abstract).  
 * Es algo intermedio entre Class e Interface.
 * No puede instanciar objetos.
 * Las clases hijas deben implementar los metodos abstractos o volver a declararlos abstract
 * 
 * @author ur00
 *
 */
public abstract class ObjetoGrafico {
	
	int x;
	int y;
		
	void mover(int xPos, int yPos) {		
		this.x = xPos;
		this.y = yPos;
	}
	
	abstract void dibujar();
	
	
}
