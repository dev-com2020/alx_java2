package org.example;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class DynamicExampleTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestFromStream(){
        Stream<String> inputStream = Stream.of("A","B","C");
        return inputStream.map(
                input -> DynamicTest.dynamicTest("Wyświetlana nazwa dla inputu " + input,
                        ()-> {
                            System.out.println("Testowane " + input);
                        }));
    }
}
