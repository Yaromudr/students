package ru.goblin.entity.person.attributes.address;

/**
 * Created by Александр on 25.09.2016.
 */
public class USAddress extends Address {
    public USAddress(String state, String city, String street, String house) {
        super("US", state, city, street, house, null);
    }

    public USAddress(String state, String city, String street, String house, String flat) {
        super("US", state, city, street, house, flat);
    }
}
