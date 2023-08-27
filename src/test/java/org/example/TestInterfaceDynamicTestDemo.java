package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

public interface TestInterfaceDynamicTestDemo {

    @TestFactory
    default Collection<DynamicTest> dynamicTestFromCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("Pierwszy test z interfejsu", ()->
                        assertTrue(true)),
                DynamicTest.dynamicTest("Drugi test z interfejsu", ()->
                        assertTrue(true)));
    }
}
