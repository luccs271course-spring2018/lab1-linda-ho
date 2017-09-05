package hw;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzBuzz {

    @Test
    public void testNegativeNumber1() {
        assertNull(FizzBuzz.fizzBuzz(-10));
    }

    @Test
    public void testNegativeNumber2() {
        assertNull(FizzBuzz.fizzBuzz(-1));
    }

    @Test
    public void testIsEmpty() {
        assertEquals(0, FizzBuzz.fizzBuzz(0).length);
    }

    @Test
    public void testPositiveNumber1() {
        assertArrayEquals(new String[] {"1"}, FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void testPositiveNumber2() {
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testPositiveNumber3() {
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz Buzz", "16", "17"}, FizzBuzz.fizzBuzz(17));
    }


}
