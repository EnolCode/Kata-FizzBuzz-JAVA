package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    
        @Test // Anotations
        public void test_fizzbuzz_example() {
            assertEquals(2, 2);
        }
        
        @Test 
            //Given
            public void test_fizzbuzz_return_divisble_3(){
                 FizzBuzz mifizzBuzz = new FizzBuzz(1);
                 mifizzBuzz.setNumber(12);
                 assertEquals("fizz", mifizzBuzz.fizz());
                }


                @Test 
                //Given
                public void test_fizzbuzz_return_divisble_5(){
                     FizzBuzz mifizzBuzz = new FizzBuzz(1);
                     mifizzBuzz.setNumber(10);
                     assertEquals("buzz", mifizzBuzz.buzz());
                    }

                
                  @Test 
                    //Given
                  public void test_fizzbuzz_return_contain_and_divisible_3(){
                       FizzBuzz mifizzBuzz = new FizzBuzz(1);
                       mifizzBuzz.setNumber(30);
                       assertEquals("Fizz", mifizzBuzz.Fizz());
                        }

    
                  @Test 
                        //Given
                   public void test_fizzbuzz_return_contain_and_divisible_5(){
                        FizzBuzz mifizzBuzz = new FizzBuzz(1);
                        mifizzBuzz.setNumber(55);
                        assertEquals("Buzz", mifizzBuzz.Buzz());
                         }
            // When
            // fizzBuzz.setBla("blo");

    
            // Then
            // assertEquals("blo", fizzBuzz.getBla());
    }


