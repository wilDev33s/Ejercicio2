package com.example.ejercicio2.ejercicio2;

import java.util.List;

public class DatosContacto {
    private String datoDeContacto;
    private List<Contactenos>contactenos;

    public DatosContacto() {
    }

    public String getDatoDeContacto() {
        return datoDeContacto;
    }

    public void setDatoDeContacto(String datoDeContacto) {
        this.datoDeContacto = datoDeContacto;
    }

    public List<Contactenos> getContactenos() {
        return contactenos;
    }

    public void setContactenos(List<Contactenos> contactenos) {
        this.contactenos = contactenos;
    }

    @Override
    public String toString() {
        return "DatosContacto{" +
                "datoDeContacto='" + datoDeContacto + '\'' +
                ", contactenos=" + contactenos +
                '}';
    }
}
