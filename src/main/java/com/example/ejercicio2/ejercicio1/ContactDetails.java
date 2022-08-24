package com.example.ejercicio2.ejercicio1;

public class ContactDetails {
    private ContactDto contactDto;

    public ContactDetails() {
    }

    public ContactDto getContactDto() {
        return contactDto;
    }

    public void setContactDto(ContactDto contactDto) {
        this.contactDto = contactDto;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "contactDto=" + contactDto +
                '}';
    }
}