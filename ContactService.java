package contact;

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	  
    public void addContact(Contact newcontact){
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getId() == newcontact.getId()){
                throw new IllegalArgumentException("ID is not unique");
            }
        }
        contacts.add(newcontact);   
    }
    
    public void deleteContact(String Id) {
    	for(int i = 0; i < contacts.size(); i++) {
    		if(contacts.get(i).getId() == Id) {
    			contacts.remove(i);
    		}
    	}
    }
    
    public void updateContact(String Id, String firstName, String lastName, String phoneNumber, String address) {
    	for(int i = 0; i < contacts.size(); i++) {
    		if(contacts.get(i).getId() == Id) {
        		if (firstName != null) {
                   contacts.get(i).setFirstName(firstName);
                }
        		if (lastName != null) {
        			contacts.get(i).setLastName(lastName);
        		}
        		if (phoneNumber != null) {
        			contacts.get(i).setPhoneNumber(phoneNumber);
        		}
        		if (address != null) {
        				contacts.get(i).setAddress(address);
        			}
    		}
    	}
    }
    
    public Contact getContactById(String id) {
        for (Contact contact : contacts) {
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null; 
    }
    
    public int size() {
        return contacts.size();
    }

}
