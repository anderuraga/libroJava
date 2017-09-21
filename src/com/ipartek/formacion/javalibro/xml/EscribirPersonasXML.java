package com.ipartek.formacion.javalibro.xml;

/**
 * Ejercicio para convertir un data/personas.txt a data/personas.xml<br>
 * 
 * estructura del TXT:<br>
 * 
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 *   
 * estructura del xml:<br>
 * 
 * <personas>
 * 		<persona>
 * 				<nombre>Ted</nombre>
 *              <apellido1>Upton</apellido1>
 *              <apellido2>Sant Andreu De La Barca</apellido2>
 *              <edad>8</edad>
 *              <email>tedfupton@mailinator.com</email>
 *              <dni>12277015Y</dni>
 *              <rol>TRABAJADOR</rol>
 * 		</persona>
 * 		<persona>
 * 			...
 *      </persona>
 * </personas>
 * 
 * 
 * 
 * @author ur00
 *
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class EscribirPersonasXML {

	public static void main(String[] args) {

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();
			
			//crear nodo raiz
			 Element rootElement = doc.createElement("personas");
	         doc.appendChild(rootElement);
	         
	         //TODO conseguir ArrayList<Persona> a partir del fichero de texto
	         
	         //TODO un bucle para todas las personas 
	         
	         //Añadir Elementos Persona al nodo raiz
	         Element ePersona = doc.createElement("persona");
	         	Element eNombre = doc.createElement("nombre");
	         	eNombre.setTextContent("Ted");
	         	//TODO resto de Campos o Elementos
	         
	         	ePersona.appendChild(eNombre);
	         rootElement.appendChild(ePersona);
	         
			
			//guardar en fichero
	         TransformerFactory transformerFactory = TransformerFactory.newInstance();
	         Transformer transformer = transformerFactory.newTransformer();
	         DOMSource source = new DOMSource(doc);
	         StreamResult result = new StreamResult(new File("data\\personas.xml"));
	         transformer.transform(source, result);
	         

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
