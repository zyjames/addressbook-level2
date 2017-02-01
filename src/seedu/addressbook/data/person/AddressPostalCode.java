package seedu.addressbook.data.person;

public class AddressPostalCode {

    private String postalCode;
    
    /**
     * Default constructor of AddressPostalCode
     */
    public AddressPostalCode() {}
    
    /**
     * Constructor to initialise the postal code of the address
     * @param postalCode
     */
    public AddressPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    /**
     * Set the postal code of the address
     * @param newPostalCode
     */
    public void setPostalCode(String newPostalCode) {
        this.postalCode = newPostalCode;
    }
    
    /**
     * Get the postal code of the address
     * @return postalCode
     */
    public String getPostalCode() {
        return this.postalCode;
    }
    
    @Override
    public String toString() {
        return this.postalCode;
    }
}
