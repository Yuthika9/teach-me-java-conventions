import org.junit.Test;
import static org.junit.Assert.*;

@Test
public void shouldReturnIndexIfTheExponentIsOne(){

    int exponent = 1;
    int index = 1;

    Power power = new Power(index,exponent);

    assertEquals(1,power.calculate());
}

@Test
public void shouldReturnOneIfTheExponentIsZero(){

    int exponent = 0;
    int index = 4;

    Power power = new Power(index,exponent);

    assertEquals(1,power.calculate());
}

@Test
public void shouldReturnNineIfTheBaseIsThreeExponentThree(){

    int exponent = 3;
    int index = 3;


    Power power = new Power(index,exponent);
    assertEquals(9,power.calculate());

}




