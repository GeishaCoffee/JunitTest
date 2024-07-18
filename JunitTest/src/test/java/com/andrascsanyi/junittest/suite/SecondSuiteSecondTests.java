package com.andrascsanyi.junittest.suite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondSuiteSecondTests {
    @Test
    void firstTest() {
        assertThat(true).isTrue();
    }
    
    @Test
    void secondTest() {
        assertThat(true).isTrue();
    }
}
