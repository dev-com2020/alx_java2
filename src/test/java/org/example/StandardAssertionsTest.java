package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardAssertionsTest {

    @Test
    void standardAssertions(){
        assertEquals(2,2);
        assertTrue(true,"Opcjonalna wiadomość");
        assertFalse(false,()-> "Bardzo" + " dziwna" + " struktura");
    }
}
