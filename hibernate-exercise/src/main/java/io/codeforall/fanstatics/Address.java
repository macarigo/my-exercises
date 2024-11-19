package io.codeforall.fanstatics;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int streetNumber;
    private String streetName;
    private String city;

    public Address(int streetNumber, String streetName, String city) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public Address() {
    }
}
