package com.example.ejercicio2.ejercicio1;

public class DocumentTypeDto {
    private String id;
    private NumberDto number;

    public DocumentTypeDto() {
    }

    @Override
    public String toString() {
        return "DocumentTypeDto{" +
                "id='" + id + '\'' +
                ", number=" + number +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NumberDto getNumber() {
        return number;
    }

    public void setNumber(NumberDto number) {
        this.number = number;
    }
}
