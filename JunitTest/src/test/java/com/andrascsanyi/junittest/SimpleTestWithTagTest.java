package com.andrascsanyi.junittest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTestWithTagTest {
    
    @Test
    @Tag("simpletesttag")
    void simpleTestWithTag() {
        assertThat(true).isTrue();
    }
}
