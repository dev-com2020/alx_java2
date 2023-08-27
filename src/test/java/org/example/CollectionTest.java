package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTest {

    @TestFactory
    List<DynamicTest> dynamicTestWithInvalidReturnType(){
        return Arrays.asList(
                DynamicTest.dynamicTest("Test Hello", ()->
                        assertEquals("Hello","Hello")));
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestFromCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("pierwszy dynamiczny test", () ->
                        assertTrue(true)),
                DynamicTest.dynamicTest("drugi dynamiczny test",()->
                        assertEquals(4,2 * 2)));
    }
    @TestFactory
    Iterable<DynamicTest> dynamicTestFromIterable() {
        return Arrays.asList(
                DynamicTest.dynamicTest("trzeci dynamiczny test", () ->
                        assertTrue(true)),
                DynamicTest.dynamicTest("czwarty dynamiczny test",()->
                        assertEquals(4,2 * 2)));
    }
    @TestFactory
    Iterator<DynamicTest> dynamicTestFromIterator() {
        return Arrays.asList(
                DynamicTest.dynamicTest("piąty dynamiczny test", () ->
                        assertTrue(true)),
                DynamicTest.dynamicTest("szósty dynamiczny test",()->
                        assertEquals(4,2 * 2))).iterator();
    }
}
