package com.example.ejercicio2.ejercicio2;

public class Contactenos {
    private  String number;
    private String tipoContacto;

    public Contactenos() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    @Override
    public String toString() {
        return "Contactenos{" +
                "number='" + number + '\'' +
                ", tipoContacto='" + tipoContacto + '\'' +
                '}';
    }
}
