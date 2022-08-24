package com.example.ejercicio2.ejercicio1;

public class NumberDto {
    private String idNumber;
    private String descriptionNumber;

    public NumberDto() {
    }

    @Override
    public String toString() {
        return "NumberDto{" +
                "idNumber='" + idNumber + '\'' +
                ", descriptionNumber='" + descriptionNumber + '\'' +
                '}';
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDescriptionNumber() {
        return descriptionNumber;
    }

    public void setDescriptionNumber(String descriptionNumber) {
        this.descriptionNumber = descriptionNumber;
    }
}
