package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BasicsTest {

    @Test
    public void compare() {
        Basics basicTests = new Basics();
        int value = basicTests.compare(2, 1);
        Assert.assertEquals(1,value);
    }
}
