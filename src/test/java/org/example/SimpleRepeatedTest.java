package org.example;

import org.junit.jupiter.api.RepeatedTest;

public class SimpleRepeatedTest {

    @RepeatedTest(5)
    void test(){
        System.out.println("Powtórzony test..");
    }
}
