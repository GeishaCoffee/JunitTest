package com.andrascsanyi.junittest.methodleveltags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodLevelTagsTest {
    
    @Test
    @Tags({
        @Tag("methodTag1"),
        @Tag("methodTag2")
    })
    void p1Test1() {
        assertThat(true).isTrue();
    }
    
    @Test
    void p1Test2() {
        assertThat(true).isTrue();
    }
    
    @Test
    @Tags({
        @Tag("methodTag3"),
        @Tag("methodTag4")
    })
    void p1Test3() {
        assertThat(true).isTrue();
    }
}
