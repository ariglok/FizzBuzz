package com.example.gloria.fizzbuzz;

/**
 * Created by gloria on 20/4/17.
 */

public class FizzBuzz {
    public String fizzBuzz(int value){
        if (value == 3){
            return "Fizz";
        }else if (value == 5){
            return  "Buzz";
        }else if ( value % 3 == 0 && value % 5 == 0) {
            return  "FizzBuzz";
        }else{
            return ""+value;
        }
    }
}
