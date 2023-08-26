package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Os.LINUX;
import static org.example.Os.MAC;

public class DisabledOnOsTest {

    @Test
    @DisabledOnOs({MAC,LINUX})
    void conditionTest(){
        System.out.println("Ten test jest wyłączony dla systemów MAC i LINUX");
    }
}
