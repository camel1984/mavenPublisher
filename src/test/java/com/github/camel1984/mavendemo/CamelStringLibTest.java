package com.github.camel1984.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class CamelStringLibTest {
    @Test
    public void testUpperString() {
        CamelStringLib lib = new CamelStringLib();
        Assert.assertEquals("1.0-SNAPSHOT-ABC", lib.upperString("abc"));
    }
}
