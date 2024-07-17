package com.andrascsanyi.junittest.classandmethodleveltags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodLevelTagsTest {
    
    @Test
    @Tags({
        @Tag("doesnthaveclasstag1"),
        @Tag("onlyemethodtag")
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
        @Tag("doesnthaveclasstag2"),
        @Tag("onlyemethodtag1")
    })
    void p1Test3() {
        assertThat(true).isTrue();
    }
}
