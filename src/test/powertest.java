package powerpackage;


import org.junit.Test;

 @Test
        public void shouldReturnOneIfTheExponentIsOne(){
            int exponent = 1;
            int index = 1;
            int ans = 1;

            Power power = new Power(index,exponent);

            assert power.findPower() == ans;
        }

        @Test
        public void shouldReturnOneIfTheExponentIsZero(){
            int exponent = 0;
            int index = 4;
            int ans = 1;
            Power power = new Power(index,exponent);

            assert power.findPower() == ans;
        }
        @Test
        public void shouldReturnTwoIfTheBaseIsTwoExponentOne(){
            int exponent = 1;
            int index = 2;
            int ans = 2;

            Power power = new Power(index,exponent);
            assert power.findPower() == ans;

        }

        @Test
        public void shouldReturnNineIfTheBaseIsThreeExponentThree(){
            int exponent = 3;
            int index = 3;
            int ans = 9;

            Power power = new Power(index,exponent);
            assert power.findPower() == ans;

}
