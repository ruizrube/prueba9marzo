/**
 * 
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ivanruizrube
 *
 */
public class HolaMundo {

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola a toda la clase!");

		Persona persona=new Persona("Paco",LocalDate.now());
		
		System.out.println("Su nombre es:" + persona.getNombreCompleto());
		
		persona.addPhoneNumber("1234");
		persona.addPhoneNumber("987");

		persona.getPhones().add("345345345");
		
		System.out.println("Tiene" + persona.getPhones().size() + " teléfonos");

		
	}

}
