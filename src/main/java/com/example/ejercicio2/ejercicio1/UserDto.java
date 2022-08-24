package com.example.ejercicio2.ejercicio1;

public class UserDto {
    private String firstName;
    private String middleName;
    private String secondLastName;
    private String sufix;
    private ContactDetails contactDetails;
    private IdentityDocumentsDto identityDocuments;


    public UserDto() {
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", sufix='" + sufix + '\'' +
                ", contactDetails=" + contactDetails +
                ", identityDocuments=" + identityDocuments +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getSufix() {
        return sufix;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public IdentityDocumentsDto getIdentityDocuments() {
        return identityDocuments;
    }

    public void setIdentityDocuments(IdentityDocumentsDto identityDocuments) {
        this.identityDocuments = identityDocuments;
    }
}
