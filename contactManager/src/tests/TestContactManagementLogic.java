package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.ContactManager;
import model.ContactManagerLogic;

public class TestContactManagementLogic {
	private ContactManagerLogic contManLogic = new ContactManagerLogic();
	private ContactManager contact = new ContactManager();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testContactName() {
		 ContactManager contact = contManLogic.addContact("Oliver");
		
		assertEquals(contact.getName(), "Oliver");
	}
	
	@Test
	public void testNameNotNull() {
		ContactManager contact = contManLogic.addContact("Oliver");
			
		assertNotNull(contact.getName(), "Oliver");
	}
	
	@Test
	public void testNameNull() {
		assertNotNull(contact.getName(), "Oliver");
	}
	
	@Test
	public void testPrintContact() {
		contact.setName("Oliver");
		contact.setPhoneNumber("555-555-5555");
		contact.setEmail("example@email.com");
		
		String printContact = contManLogic.printContact(contact);
		
		assertEquals(printContact, "Oliver\n555-555-5555\nexample@email.com");
	}

}
