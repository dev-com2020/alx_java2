package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    void timeoutExceededWithPreemptiveTermination(){
        assertTimeoutPreemptively(ofMillis(10),()->{
            Thread.sleep(100);
        });
    }

    private static String greeting() {
        return "Witaj Świecie";
    }

}
