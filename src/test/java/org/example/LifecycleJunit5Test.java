package org.example;

import org.junit.jupiter.api.*;

@Disabled(value = "All the test in this class will be skipped")
class LifecycleJunit5Test {

    @BeforeAll
    static void setupAll(){
        System.out.println("Konfiguracja dla wszystkich testów");
    }

    @BeforeEach
    void setup(){
        System.out.println("Konfiguracja przed każdym testem w klasie");
    }

    @Test
    void testOne(){
        System.out.println("TEST 1");
    }

    @Test
    void testTwo(){
        System.out.println("TEST 2");
    }

    @Disabled
    @Test
    void disabledTest(){}

    @AfterEach
    void tearDown(){
        System.out.println("Zamknięcie po każdym teście w klasie");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Zamknięcie wszystkich testów w klasie");
    }

}
