package seedu.addressbook.data.person;

public class AddressBlock {
    
    private String block;
    
    /**
     * Default constructor of AddressBlock
     */
    public AddressBlock() {}
    
    /**
     * Constructor to initialise the block of the address
     * @param block
     */
    public AddressBlock(String block) {
        this.block = block;
    }
    
    /**
     * Set the block of the address
     * @param newBlock
     */
    public void setBlock(String newBlock) {
        this.block = newBlock;
    }
    
    /**
     * Get the block of the address
     * @return block
     */
    public String getBlock() {
        return this.block;
    }
    
    @Override
    public String toString() {
        return this.block;
    }
}
