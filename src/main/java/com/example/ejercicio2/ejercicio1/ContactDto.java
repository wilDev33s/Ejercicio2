package com.example.ejercicio2.ejercicio1;

public class ContactDto {
    private String number;
    private String contactDetailType;


    public ContactDto() {
    }

    @Override
    public String toString() {
        return "ContactDto{" +
                "number='" + number + '\'' +
                ", contactDetailType='" + contactDetailType + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getContactDetailType() {
        return contactDetailType;
    }

    public void setContactDetailType(String contactDetailType) {
        this.contactDetailType = contactDetailType;
    }
}
