package com.example.gloria.fizzbuzz;

/**
 * Created by gloria on 20/4/17.
 */

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void returFizzIfInputIsTree(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Fizz",fizzBuzz.fizzBuzz(3));
    }

    @Test
    public void returBuzzIfInputIsFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("Buzz",fizzBuzz.fizzBuzz(5));
    }

    @Test
    public void returValueIfInputIsSeven(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("7",fizzBuzz.fizzBuzz(7));
    }

    @Test
    public void returFizzBuzzIfInputIsMultipleOfTreeAndFive(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz(15));
    }


}
