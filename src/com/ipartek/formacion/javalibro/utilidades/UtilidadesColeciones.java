package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesColeciones {

	/**
	 * Ordena un Array con el metodo bubble-sort
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado Array desordenado
	 * @param orden true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray( int[] aDesordenado, boolean orden ) {
		
		int[] resul = aDesordenado.clone();
		int aux = 0;
		if (orden) { //mayor a menor
		
			for (int i = 0; i < resul.length; i++) {
				for (int j = 0; j < resul.length-1; j++) {
					if( resul[j] < resul[j+1]){
						aux = resul[j+1];
						resul[j+1] = resul[j];
						resul[j] = aux;						
					}
				}
			}
			
		}else { // menor a mayor 
			for (int i = 0; i < resul.length; i++) {
				for (int j = 0; j < resul.length-1; j++) {
					if( resul[j] > resul[j+1]){
						aux = resul[j+1];
						resul[j+1] = resul[j];
						resul[j] = aux;						
					}
				}
			}
		}			
		return resul;
	}
	
}
