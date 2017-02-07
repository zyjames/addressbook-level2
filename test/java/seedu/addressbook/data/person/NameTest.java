package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {
    private Name name;
    
    @Before
    public void setup() throws IllegalValueException {
        name = new Name("Name");
    }

    @Test
    public void isSimilarNullShouldReturnFalse() {
        assertFalse(name.isSimilar(null));
    }
    
    @Test
    public void isSimilarDifferentNameShouldReturnFalse() throws IllegalValueException {
        assertFalse(name.isSimilar(new Name("another name")));
    }
    
    @Test
    public void isSimilarSingleCharacterShouldReturnFalse() throws IllegalValueException {
        assertFalse(name.isSimilar(new Name("a")));
    }
    
    @Test
    public void isSimilarSingleDifferentNameShouldReturnFalse() throws IllegalValueException {
        assertFalse(name.isSimilar(new Name("another")));
    }
    
    @Test
    public void isSimilarNameShouldReturnTrue() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("Name")));
    }
}
