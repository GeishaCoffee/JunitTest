package com.andrascsanyi.junittest.suite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstSuiteFirstTests {
    
    @Test
    void firstSuite() {
        assertThat(true).isTrue();
    }
}
