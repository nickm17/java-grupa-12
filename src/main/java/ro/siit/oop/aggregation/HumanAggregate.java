package ro.siit.oop.aggregation;

import ro.siit.oop.Address;
import ro.siit.oop.composition.HumanComposition;

public class HumanAggregate {
    private String name;
    private Address address;

    public HumanAggregate() {}
    public HumanAggregate(String name){
        this.name = name;
    }

    /**
     * vdfsdsdfsdfsdf
     *
     * @param name nkfdkkaskndkfmas
     * @param address scurta descriere
     * @return sdasdasasd
     */
    public HumanAggregate(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setAdress (Address address) {
        this.address = address;
    }

    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Iuliu Maniu");
        HumanAggregate humanAggregate = new HumanAggregate("humanAggregate", address);

        HumanComposition humanComposition = new HumanComposition("humanComposition");
    }
}