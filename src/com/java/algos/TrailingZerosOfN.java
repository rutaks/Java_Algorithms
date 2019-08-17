package com.java.algos;


// Method that will calculate the number of trailing zeros in a factorial of a given number.

public class TrailingZerosOfN {
    public static int findZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) count += n / i;
        return count;
    }
}
