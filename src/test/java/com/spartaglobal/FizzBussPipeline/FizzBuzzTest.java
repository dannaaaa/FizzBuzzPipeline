package com.spartaglobal.FizzBussPipeline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz(1,16);

    @Test
    public void divisibleByTest() {
        assertTrue(fizzBuzz.divisibleBy(2,1));
        assertFalse(fizzBuzz.divisibleBy(3,2));
    }

    @Test
    public void fizzBuzzIteratorTest() {
        List<String> minFizzBuzzList = List.of("1","2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(minFizzBuzzList, fizzBuzz.getFizzBuzzList());
    }
}
