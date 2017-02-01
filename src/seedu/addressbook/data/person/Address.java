package seedu.addressbook.data.person;

import java.util.Scanner;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in this format: a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = "[\\d\\w]{1,}[,\\s].{1,}[,\\s].{1,}[,\\s][\\d]+";
    public static final String ADDRESS_DELIMITER = ",";

    //public final String value;
    private boolean isPrivate;
    
    /** Attribute of the user's address */
    private AddressBlock block;
    private AddressStreet street;
    private AddressUnit unit;
    private AddressPostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        } else {
            Scanner addressScanner = new Scanner(trimmedAddress).useDelimiter(ADDRESS_DELIMITER);
            setAddress(addressScanner.next(), addressScanner.next(), addressScanner.next(), addressScanner.next());
            //value = trimmedAddress;
        }
    }
    
    /**
     * Initialise the subclasses (block, street, postalCode, unit) of the address
     * @param block
     * @param street
     * @param unit
     * @param postalCode
     */
    private void setAddress(String block, String street, String unit, String postalCode) {
        this.block = new AddressBlock(block.trim());
        this.street = new AddressStreet(street.trim());
        this.unit = new AddressUnit(unit.trim());
        this.postalCode = new AddressPostalCode(postalCode.trim());
    }
    
    /**
     * Build the full address using the details stored in the various address subclasses
     * @return full address
     */
    private String getAddress() {
        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(block.getBlock() + ADDRESS_DELIMITER + " ");
        addressBuilder.append(street.getStreet() + ADDRESS_DELIMITER + " ");
        addressBuilder.append(unit.getUnit() + ADDRESS_DELIMITER + " ");
        addressBuilder.append(postalCode.getPostalCode());
        return addressBuilder.toString();
    }

    /**
     * Returns true if a given string is a valid person address.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return getAddress();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
