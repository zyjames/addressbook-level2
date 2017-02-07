package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {
    @Test
    public void emptyListShouldReturnFalse() {
        // empty list
        assertIsNotNull();
    }
    
    @Test
    public void anyEmptyListShouldReturnFalse() {
        // Any non-empty list
        assertIsNotNull(new Object(), new Object());
        assertIsNotNull("test");
        assertIsNotNull("");
    }
    
    @Test
    public void nonEmptyListWithStartElementNullShouldReturnTrue() {
        // non empty list with just one null at the beginning
        assertIsAnyNull((Object) null);
        assertIsAnyNull(null, "", new Object());
        assertIsAnyNull(null, new Object(), new Object());
    }
    
    @Test
    public void nonEmptyListWithMiddleElementNullShouldReturnTrue() {
        // non empty list with nulls in the middle
        assertIsAnyNull(new Object(), null, null, "test");
        assertIsAnyNull("", null, new Object());
    }
    
    @Test
    public void nonEmptyListWithLastElementNullShouldReturnTrue() {
        // non empty list with one null as the last element
        assertIsAnyNull("", new Object(), null);
        assertIsAnyNull(new Object(), new Object(), null);
    }
    
    @Test
    public void nonEmptyListWithElementNotNullShouldReturnTrue() {
        // non empty list with one null as the last element
        assertIsNotNull("test");
        assertIsNotNull(true);
        assertIsNotNull(false);
        assertIsNotNull('a');
        assertIsNotNull(1);
    }
    
    @Test
    public void nonEmptyListWithNullElementShouldReturnFalse() {
        // confirms nulls inside the list are not considered
        List<Object> nullList = Arrays.asList((Object) null);
        assertIsNotNull(nullList);
    }
    
    @Test
    public void nonEmptyNullListShouldReturnFalse() {
        // non empty list of null list
        ArrayList<List<Object>> nullListList = new ArrayList<List<Object>>();
        nullListList.add(Arrays.asList((Object) null));
        assertIsNotNull(nullListList);
    }
    
    @Test
    public void emptyListElementsAreUniqueShouldReturnTrue() throws Exception {
        // empty list
        assertAreUnique();
    }
    
    @Test
    public void listWithOneElementAreUniqueShouldReturnTrue() throws Exception {
        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");
        assertAreUnique("a", 'a');
        assertAreUnique(1, 1.0);
        assertAreUnique("123", 123);
    }
    
    @Test
    public void listWithAllUniqueElementsShouldReturnTrue() throws Exception {
        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);
    }
    
    @Test
    public void listWithDuplicateElementsShouldReturnFalse() throws Exception {
        // some identical objects
        assertNotUnique("", "");
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(new Integer(1), null, new Integer(1));
        assertNotUnique(null, 123, new Integer(123));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }
    
    private void assertIsNotNull(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }
    
    private void assertIsAnyNull(Object...objects) {
        assertTrue(Utils.isAnyNull(objects));
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }
}
