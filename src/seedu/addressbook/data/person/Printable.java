package seedu.addressbook.data.person;

/**
 * A immutable interface to display a Peron's details
 * Implementations should guarantee: details are present and not null, field values are validated.
 */
public interface Printable {
	
	String getPrintableString();
}
