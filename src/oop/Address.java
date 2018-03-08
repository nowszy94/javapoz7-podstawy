package oop;

public class Address {
    public String city;
    public String street;
    public String postalCode;
    public int number;

    public Address() {
        this.city = "Poznan";
    }

    public Address(String city, String street, String postalCode, int number) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.number = number;
    }

    public void show() {
        System.out.println(postalCode + " " + city +
                ", ul. " + street + " " + number);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
