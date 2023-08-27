package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

public class StreamExampleTest {
    @TestFactory
    Stream<DynamicTest> streamTest(){
//        wprowadzanie danych
        Integer array[] = {1,2,3,4,5};
        Iterator<Integer> inputGenerator = Arrays.asList(array).iterator();
//        wyświetlanie nazw
        Function<Integer, String> displayNameGenerator = (input) ->
           "Data input:" + input;
//        wykonawca testu
        ThrowingConsumer<Integer> testExecutor = (input) -> {
            System.out.println(input);
            assertTrue(input % 2 == 0);
        };

        return stream(inputGenerator, displayNameGenerator, testExecutor);


    }
}
