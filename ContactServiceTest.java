package contact;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;


    @BeforeEach
    void setUp() {
        contactService = new ContactService();
    }

    @Test
    void testAddContactWithUniqueID() {
    }

    @Test
    void testAddContactWithDuplicateID() {
    }

    @Test
    void testDeleteContact() {
    }

    @Test
    void testUpdateContactFields() {
    }

    @Test
    void testUpdateNonExistentContact() {
    }

    @Test
    void testSize() {
        assertEquals(0, contactService.size());

        Contact contact1 = new Contact("1234567", "Sean", "Hehr", "1234456772", "1234Drive");
        Contact contact2 = new Contact("1234564", "Sean", "Hehr", "1234456772", "1234Drive");

        contactService.addContact(contact1);
        contactService.addContact(contact2);

        assertEquals(2, contactService.size());

        contactService.deleteContact("1234567");
        assertEquals(1, contactService.size());

        contactService.deleteContact("1234564");
        assertEquals(0, contactService.size());
    }

    @Test
    void testAddAndUpdateContact() {
        assertEquals(0, contactService.size());

        Contact contact1 = new Contact("1234567", "Sean", "Hehr", "1234456772", "1234Drive");
        contactService.addContact(contact1);
        assertEquals(1, contactService.size());

        contactService.updateContact("1234567", "Sean", "Hehr", "1234456772", "1234Drive");

        Contact updatedContact = contactService.getContactById("1234567");
        assertEquals("Sean", updatedContact.getFirstName());
        assertEquals("Hehr", updatedContact.getLastName());
        assertEquals("1234456772", updatedContact.getPhoneNumber());
        assertEquals("1234Drive", updatedContact.getAddress());
    }

}
