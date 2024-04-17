package powerpackage;

    private final int base;
    private final int exponent;

    public Power(int base, int exponent) {

        this.base = base;
        this.exponent = exponent;
    }

    public int findPower() {
        int pow = base;
        if(exponent == 0) {
            return 1;
        }
        if(exponent == 1) {
            return base;
        }
        for(int i = 1; i <=exponent; i++) {
            pow = pow * base;
        }
        return pow;
    }
}
