package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;

public class MyFirstJunit5Test {

    @Test
    void myFirstTest(){
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(2,1+1,message);
    }

    @Test
    void myFirstTest2(){
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(3,1+1,message);
    }

    @Test
    public void myFirstTest4(){
//        kod w wersji jUnit4
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(message,2,1+1);
    }
}
