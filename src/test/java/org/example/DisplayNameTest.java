package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Specjalny zestaw testowy")
class DisplayNameTest {

    @Test
    @DisplayName("Custom test name with spaces  ...")
    void testWithDisplayNameWithSpaces(){
        System.out.println("Custom test name with spaces  ...");
    }

    @Test
    @DisplayName("\uD83D\uDC7B")
    void testWithDisplayNameWithSpecialChar(){
        System.out.println("\uD83D\uDC7B");
    }

    @Test
    @DisplayName("Ƕ\tȼΨ")
    void testWithDisplayWithCrazyChar(){
        System.out.println("Ƕ\tȼΨ");
    }
}
