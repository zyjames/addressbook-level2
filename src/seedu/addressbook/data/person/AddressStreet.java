package seedu.addressbook.data.person;

public class AddressStreet {
    
    private String street;
    
    /**
     * Default constructor of AddressStreet
     */
    public AddressStreet() {}
    
    /**
     * Constructor to initialise the street of the address
     * @param street
     */
    public AddressStreet(String street) {
        this.street = street;
    }
    
    /**
     * Set the street of the address
     * @param newStreet
     */
    public void setStreet(String newStreet) {
        this.street = newStreet;
    }
    
    /**
     * Get the street of the address
     * @return street
     */
    public String getStreet() {
        return this.street;
    }
    
    @Override
    public String toString() {
        return this.street;
    }
}
