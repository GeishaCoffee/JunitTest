package com.andrascsanyi.junittest.classleveltags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Tags({
    @Tag("multitag1"),
    @Tag("multitag2")
})
public class ClassLevelTags2Tests {
    
    @Test
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
