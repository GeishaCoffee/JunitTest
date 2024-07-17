package com.andrascsanyi.junittest.classandmethodleveltags;

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
    @Tag("hasclasstags")
    void p1Test1() {
        assertThat(true).isTrue();
    }
    
    @Test
    void p1Test2() {
        assertThat(true).isTrue();
    }
    
    @Test
    @Tag("hasclasstags2")
    void p1Test3() {
        assertThat(true).isTrue();
    }
}
