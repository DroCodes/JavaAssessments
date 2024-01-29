/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Jan 28, 2024
 */
package model;

/**
 * 
 */
public class ContactManagerLogic {
	public ContactManager addContact(String name) {
		ContactManager contact = new ContactManager(name);
		return contact;
	}
	
	public String printContact(ContactManager contact) {
		return contact.getName() + "\n" + contact.getPhoneNumber() + "\n" + contact.getEmail();
	}
}
