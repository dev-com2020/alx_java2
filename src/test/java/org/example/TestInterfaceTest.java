package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterfaceTest implements TestLifecycleLogger,TestInterfaceDynamicTestDemo {

    @Test
    void isEqualValue(){
        assertEquals(1,1);
    }
}
