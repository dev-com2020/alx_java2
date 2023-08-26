package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


class HemcrestTest {

    @Test
    void assertWithHamcrestMatcher(){
        assertThat(2+1, equalTo(3));
        assertThat("Hej!", notNullValue());
        assertThat("Hello world", containsString("world"));
    }
}
