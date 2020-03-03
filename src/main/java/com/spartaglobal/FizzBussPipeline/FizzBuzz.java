package com.spartaglobal.FizzBussPipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    private List range;
    private List fizzBuzzList = new ArrayList();

    public FizzBuzz(int startOfRange, int endOfRange){
        range = IntStream.rangeClosed(startOfRange, endOfRange).boxed().collect(Collectors.toList());
        fizzBuzzIterator(range);
    }


    public boolean divisibleBy(int i, int divider){
        if (i % divider == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void fizzBuzzIterator(List range){


        for (int i = 1; i <range.size(); i++){
            if (((divisibleBy(i,3)) && (divisibleBy(i,5)))){
                fizzBuzzList.add("FizzBuzz");
            } else if (divisibleBy(i, 5)) {
                fizzBuzzList.add("Buzz");
            } else if (divisibleBy(i,3)) {
                fizzBuzzList.add("Fizz");
            } else{
                fizzBuzzList.add(Integer.toString(i));
            }

        }

    }

    public List getFizzBuzzList() {
        return fizzBuzzList;
    }

}
