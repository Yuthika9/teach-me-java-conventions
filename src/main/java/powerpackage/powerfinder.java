package org.example;

public class Power {

    private final int base;
    private final int exponent;

    public Power(int base, int exponent) {

        this.base = base;
        this.exponent = exponent;
    }

    public int calculate() {

        int pow = base;

        boolean exp_is_zero = (exponent == 0);
        boolean exp_is_one = exponent == 1;

        if(exp_is_zero) {
            return 1;
        }

        if(exp_is_one) {
            return base;
        }

        for(int iterator = 1; iterator <= exponent; iterator++) {
            pow = pow * base;
        }

        return pow;
    }
}


