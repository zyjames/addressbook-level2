package seedu.addressbook.data.person;

public class AddressUnit {
    
    private String unit;
    
    /**
     * Default constructor of AddressUnit
     */
    public AddressUnit() {}
    
    /**
     * Constructor to initialise the unit of the address
     * @param unit
     */
    public AddressUnit(String unit) {
        this.unit = unit;
    }
    
    /**
     * Set the unit of the address
     * @param newUnit
     */
    public void setUnit(String newUnit) {
        this.unit = newUnit;
    }
    
    /**
     * Get the unit of the address
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }
}
