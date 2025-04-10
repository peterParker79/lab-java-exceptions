package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {

    PersonsList personsList;


    @BeforeEach
    void setUpPersonsList() {
        personsList= new PersonsList();

    }

    @Test
    @DisplayName("to ensure that it properly finds" +
            " and returns the correct Person object" +
            " when given a properly formatted name")

    void findByName() {
        Person personExist= personsList.findByName("Hugo Sanchez");
        assert "Hugo Sanchez".equalsIgnoreCase(personExist.getName());

        // Here must be throw exception
        assertThrows(IllegalArgumentException.class,
                ()->personsList.findByName("NombreApellidoSinEspacios"));
    }

    @Test
    void testClone() {
    }
}