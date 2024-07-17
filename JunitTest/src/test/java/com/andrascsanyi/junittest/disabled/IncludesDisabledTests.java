package com.andrascsanyi.junittest.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IncludesDisabledTests {
    
    @Test
    @Disabled
    void p1Test1() {
        assertThat(true).isTrue();
    }
    
    @Test
    void p1Test2() {
        assertThat(true).isTrue();
    }
    
    @Test
    void p1Test3() {
        assertThat(true).isTrue();
    }
}
