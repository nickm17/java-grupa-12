package ro.siit.oop;

public class Address {

    private String street;

    /**
     * This method sets the name of the street
     *
     * @return a string with street name
     */
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address() {
    }

    public Address(Address address){

    }
}
