package com.example.ejercicio2.ejercicio1;

public class IdentityDocumentsDto {
    private  DocumentTypeDto documentType;
    private String documentNumber;

    public IdentityDocumentsDto() {
    }

    @Override
    public String toString() {
        return "IdentityDocumentsDto{" +
                "documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }

    public DocumentTypeDto getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeDto documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
