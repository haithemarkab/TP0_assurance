package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getFullNameShouldReturnFirstNameAndLastName() {
        Person person = new Person("Arkab","mohamed_haithem",18);
        assertEquals(person.getFullName(),"Arkab mohamed_haithem");
    }

    @org.junit.jupiter.api.Test
    void isAdultShouldReturnTrueIfAgeIsGreaterThanOrEqual18FalseIfAgeIsLessThan18() {
        Person person = new Person("Arkab","mohamed_haithem",18);
        assertEquals(person.isAdult(),true);

    }
}