package ru.goblin.entity.person.attributes.address;

/**
 * Created by Александр on 25.09.2016.
 */
public class Address {
    protected String country;
    protected String state;
    protected String city;
    protected String street;
    protected String house;
    protected String flat;



    public Address(String country, String state, String city, String street, String house) {
        this(country, state, city, street, house, null);
    }

    public Address(String country, String state, String city, String street, String house, String flat) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
