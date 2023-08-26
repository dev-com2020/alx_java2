package org.example;


public class Address {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private String firstName;
    private String lastName;

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
