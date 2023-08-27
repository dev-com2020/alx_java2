package org.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public interface TestLifecycleLogger {
    static final Logger log = LoggerFactory.getLogger(TestLifecycleLogger.class.getName());

    @BeforeAll
    static void beforeAllTests(){
        log.info("beforeAllTests");
    }

    @AfterAll
    static void afterAllTests(){
        log.info("afterAllTests");
    }

    @BeforeEach
    default void beforeEachTest(TestInfo testInfo){
        log.info("Informacje o wykonaniu {}", testInfo.getDisplayName());
    }

    @AfterEach
    default void afterEachTest(TestInfo testInfo){
        log.info("Zakończenie wykonania {}", testInfo.getDisplayName());
    }
}
