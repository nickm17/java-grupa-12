package ro.siit.oop.composition;

import ro.siit.oop.Address;

public class HumanComposition {
    private String userName;
    private Address address;
    private String secretKey;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName + secretKey;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HumanComposition(String userName) {
        this.userName = userName;
        this.address = new Address();
    }
}
