package org.example;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;


class TimeoutWithResultOrMethodTest {

    @Test
    void timeoutNotExceededWithResult(){
        String actualResult = assertTimeout(ofMinutes(1),()->{
            return "Cześć!";
        });
        assertEquals("Cześć!", actualResult);

    }
    @Test
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(ofMinutes(1),
            TimeoutWithResultOrMethodTest::greeting);
        assertEquals("Witaj Świecie", actualGreeting);
    }

    private static String greeting() {
        return "Witaj Świecie";
    }

}
