package org.example;

import org.junit.jupiter.api.Test;

class GroupedAssertionsTest {

    @Test
    void groupedAssertions(){
        Addres address = new Address("John","Smith");
        assertAll("address",()-> assertEquals("John",address.getFirstName()),
                ()-> assertEquals("User",address.getLastName()));
    }
}
