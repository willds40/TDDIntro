package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {

            if (i < 0) {
                throw new IllegalArgumentException();
            }
            if (i == 0) {
                return 1;
            }
            if (i > 2) {
                i = i * 2;
                return i;
            }
            return i;

    }
}