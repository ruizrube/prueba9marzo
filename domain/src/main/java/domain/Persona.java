/**
 * dsfsdfsdfdsf
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ivanruizrube sdfsdf
 */
public class Persona {

	private List<String>phones=new ArrayList();
	
	
	public List<String> getPhones(){
		return phones;
	}
	
	public boolean addPhoneNumber(String phone) {
		
		if(phones.size()<2) {
			phones.add(phone);
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	private String surname="Fernandez";

	private LocalDate birthDate;

	public Persona(String name, LocalDate birthDate) {
		super();
		this.name = name;

		this.birthDate = birthDate;
	}

	public String getNombreCompleto() {

		return name + " " + surname;
	}

	
	
}
