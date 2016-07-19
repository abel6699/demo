package com.hpe.g11n.cicd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {
    private Greeting greeting;

    @Before
    public void setUp() throws Exception {
        greeting = new Greeting();
    }

    @Test
    public void testSayHi() throws Exception {
        String result = greeting.sayHi();
        assertTrue(result.contains("Hello"));
    }

    @Test
    public void testSayHi_failed() throws Exception {
        String result = greeting.sayHi();
        assertTrue(result.contains("zhouda"));
    }
}
