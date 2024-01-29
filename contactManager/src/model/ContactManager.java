/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Jan 28, 2024
 */
package model;

/**
 * 
 */
public class ContactManager {
	private String name;
	private String phoneNumber;
	private String email;
	
	public ContactManager() {

	}
	
	public ContactManager(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
