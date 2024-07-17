package com.andrascsanyi.junittest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ArgumentSourceTests {
    
    @ParameterizedTest
    @ArgumentsSource(ArgumentsSourceTestsData.class)
    void argumentSourceTestsMethod(String value) {
        assertThat(true).isTrue();
    }
}
