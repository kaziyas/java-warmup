package com.noname;

import java.util.stream.LongStream;

/**
 *
 * @author yaser.kazerooni (yaser.kazerooni@gmail.com)
 * @created 21/April/2022
 * @project java-warmup
 *
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
 * of both three and five print “FizzBuzz”.
 */

public class FizzBuzz {

    public static void main(String[] args){
        LongStream.rangeClosed(1, 100).boxed().forEach(n -> {
            if (n % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(n);
            }
        });
    }
}
