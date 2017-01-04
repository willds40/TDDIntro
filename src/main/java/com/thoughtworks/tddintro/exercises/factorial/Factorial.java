package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
            int sum =1;
            if (i < 0) {
                throw new IllegalArgumentException();
            }
            if (i == 0) {
                return 1;
            }
            if (i >= 2) {
             for (int j = 0; j<i ; j++) {
                 sum += sum * j;
             }
                return sum;
            }
            return i;


    }
}