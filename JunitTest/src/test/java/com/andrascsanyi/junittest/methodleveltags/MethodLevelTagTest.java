package com.andrascsanyi.junittest.methodleveltags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodLevelTagTest {
    
    @Test
    @Tag("p1Test1-tag")
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
