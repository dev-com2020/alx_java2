package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled()
class GroupedAssertionsTest {

    @Test
    void groupedAssertions(){
        Address address = new Address("John","Smith");
        assertAll("address",()-> assertEquals("John",address.getFirstName()),
                ()-> assertEquals("User",address.getLastName()));
    }
}
