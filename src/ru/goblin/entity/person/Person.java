package ru.goblin.entity.person;

import ru.goblin.entity.courses.Course;
import ru.goblin.entity.person.attributes.address.Address;
import ru.goblin.entity.person.attributes.visa.Visa;

/**
 * Created by Александр on 25.09.2016.
 */
public abstract class Person {
    protected String name, phoneNumber;
    protected int id;
    protected Address USAddress, ownCountryAddress;
    protected Visa visa;

    public Person(String name, int id, String phoneNumber, Address USAddress, Address ownCountryAddress, Visa visa) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.USAddress = USAddress;
        this.ownCountryAddress = ownCountryAddress;
        this.visa = visa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getUSAddress() {
        return USAddress;
    }

    public void setUSAddress(Address USAddress) {
        this.USAddress = USAddress;
    }

    public Address getOwnCountryAddress() {
        return ownCountryAddress;
    }

    public void setOwnCountryAddress(Address ownCountryAddress) {
        this.ownCountryAddress = ownCountryAddress;
    }

    public Visa getVisa() {
        return visa;
    }

    public void setVisa(Visa visa) {
        this.visa = visa;
    }

    public abstract void applyToCourse(Course course);
}
