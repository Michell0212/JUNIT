package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void sumTest() {
        int sum = App.sum(1,2);
        assertEquals(3, sum);
    }
}