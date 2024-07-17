package com.andrascsanyi.junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleWithDisplayNameTest {
    
    @Test
    @DisplayName("This is the value of the display name")
    void displayName() {
        assertThat(true).isTrue();
    }
    
    @Test
    @DisplayName("This is another test with display name")
    void displayName2() {
        assertThat(true).isTrue();
    }
}
