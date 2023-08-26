package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//import org.testng.annotations.Test;


@Tag("non-functional")
class SimpleTaggingTest {

    @Test
    @Tag("performance")
    @Tag("load")
    void testingTaxCalculation() {
        System.out.println("Non-functional Test 1 (performance/load)");
    }

    @Test
    @Tag("security")
    void testingTaxCalculation2() {
        System.out.println("Non-functional Test 2 (security)");
    }

}
