package de.adesso.isaqbtrainingddd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {

    @Test
    void foo() {
        Assertions.assertEquals("bar", new Foo().foo());
    }
}
