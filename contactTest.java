package contact;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class contactTest {
	
	@Test
	void testContact() {
		Contact contact = new Contact("1234567", "Sean", "Hehr", "1234456772", "1234Drive");
		assertTrue(contact.getId().equals("1234567"));
		assertTrue(contact.getFirstName().equals("Sean"));
		assertTrue(contact.getLastName().equals("Hehr"));
		assertTrue(contact.getPhoneNumber().equals("1234456772"));
		assertTrue(contact.getAddress().equals("1234Drive"));
	}
	
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("12345671231", "Sean", "Hehr", "1234456772", "1234Drive");
		}); 
	}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean Austin Toon", "Hehr", "1234456772", "1234Drive");
		}); 
	}

	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", "Hehr is too long ", "1234456772", "1234Drive");
		}); 
	}
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", "Hehr", "12344567722545", "1234Drive");
		}); 
	}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", "Hehr", "1234456772", "1234Drive in cheyenne wyoming at 8207");
		}); 
	}
	
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact(null, "Sean", "Hehr", "1234456772", "1234Drive");
		}); 
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", null, "Hehr", "1234456772", "1234Drive");
		}); 
	}

	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", null, "1234456772", "1234Drive");
		}); 
	}
	
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", "Hehr", null, "1234Drive");
		}); 
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,()->{
			new Contact("1234567", "Sean", "Hehr", "1234456772", null);
		}); 
	}
	
}
