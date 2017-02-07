package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * Represents the tag added/removed from a Person
 */
public class Tagging {

    private boolean isAdd; // Assume that there is only add or remove command for tagging
    private Person person;
    private Tag tag;
    
    /**
     * Assumption: Every field must be present and not null.
     */
    public Tagging(boolean isAdd, Person person, Tag tag) {
        this.isAdd = isAdd;
        this.person = person;
        this.tag = tag;
    }
    
    /**
     * Gets the tagging record of a Person
     */
    public String getTaggingRecord() {
        StringBuilder taggingBuilder = new StringBuilder();
        if (isAdd) {
            taggingBuilder.append("+ ");
        } else {
            taggingBuilder.append("- ");
        }
        taggingBuilder.append(person.getName() + " " + tag.toString());
        
        return taggingBuilder.toString();
    }
    
    @Override
    public String toString() {
        return getTaggingRecord();
    }
}
