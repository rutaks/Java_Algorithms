package com.java.algos;

import java.util.ArrayList;
import java.util.List;

//Given an array (which will have a length of at least 3, but could be very large) containing integers.
//The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
//This is method that takes the array as an argument and returns this "outlier" N

public class FindTheParityOutlier {
    public int find(int[] numbers){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for(int i = 0;  i < numbers.length; i++){
            if(numbers[i]%2 == 0)
                even.add(numbers[i]);
            else
                odd.add(numbers[i]);
        }

        if(odd.size() > even.size())
            return even.get(0);
        else
            return odd.get(0);
    }
}
