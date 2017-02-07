package seedu.addressbook.data.person;

/**
 * Represent a Person's contact in the address book.
 */
public class Contact {

	public final String value;
    private boolean isPrivate;
    
    public Contact(String value, boolean isPrivate) {
    	this.value = value;
    	this.isPrivate = isPrivate;
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
