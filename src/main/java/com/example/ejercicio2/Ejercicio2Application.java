package com.example.ejercicio2;

import com.example.ejercicio2.ejercicio1.*;
import com.example.ejercicio2.ejercicio2.Contactenos;
import com.example.ejercicio2.ejercicio2.DatosContacto;
import com.example.ejercicio2.ejercicio2.Documento;
import com.example.ejercicio2.ejercicio2.Users;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio2Application {

    public static void main(String[] args) {
        Users usersJsonresponse = generateData();

        System.out.println(usersJsonresponse.toString());

        UserDto userDtoResponse = generateData2();
        System.out.println(userDtoResponse);
    }

    public static Users generateData(){


        List<Contactenos> contactenosList= new ArrayList<>();


        for (int i =0; i<100;i++){
            Contactenos contactenos = new Contactenos();
            contactenos.setNumber("23"+ i);
            contactenos.setTipoContacto("telefono"+ i);
            contactenosList.add(contactenos);
        }


        DatosContacto datosContacto=  new DatosContacto();
        datosContacto.setDatoDeContacto("32323232323");
        datosContacto.setContactenos(contactenosList);

        Documento documento = new Documento();
        documento.setDescripcion("documentoidentity");
        documento.setNumero(23);
        documento.setTipo("cc");

        Users users = new Users();
        users.setNombreCompleto("jinggles");
        users.setSufijo("Masterpuls");
        users.setDatosContacto(datosContacto);
        users.setDocumento(documento);

        return users;
    }


    public static UserDto generateData2(){

        NumberDto numberDto = new NumberDto();
        numberDto.setIdNumber("1233");
        numberDto.setDescriptionNumber("bookok");

        DocumentTypeDto documentTypeDto = new DocumentTypeDto();
        documentTypeDto.setId("12vv");
        documentTypeDto.setNumber(numberDto);

        IdentityDocumentsDto identityDocumentsDto= new IdentityDocumentsDto();
        identityDocumentsDto.setDocumentNumber("23568777");
        identityDocumentsDto.setDocumentType(documentTypeDto);

        ContactDto contactDto= new ContactDto();
        contactDto.setNumber("12344");
        contactDto.setContactDetailType("Email");

        ContactDetails contactDetails= new ContactDetails();
        contactDetails.setContactDto(contactDto);

        UserDto userDto= new UserDto();
        userDto.setFirstName("Juan");
        userDto.setMiddleName("Perez");
        userDto.setSecondLastName("Camilo");
        userDto.setSufix("Mr");
        userDto.setContactDetails(contactDetails);
        userDto.setIdentityDocuments(identityDocumentsDto);

        return userDto;
    }

}
