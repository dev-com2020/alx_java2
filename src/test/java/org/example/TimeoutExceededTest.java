package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class TimeoutExceededTest {

    @Test
    void timeoutNotExceeded(){
        assertTimeout(ofMinutes(2), () -> {
//            Tutaj czekamy na upłynięcie czasu
        });

    }
    @Test
    void timeoutExceeded(){
        assertTimeout(Duration.ofMillis(10),()->{
            Thread.sleep(100);
        });
    }
}
