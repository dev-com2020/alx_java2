package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class TuningDisplayRepTest {

    @RepeatedTest(value = 2, name="{displayName} {currentRepetition} / {totalRepetitions}")
    @DisplayName("Powtórka!")
    void customDisplayName(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }
}
