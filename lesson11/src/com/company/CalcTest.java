package com.company;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void shouldSumIntegersWithoutExceptions()
    {
        //given
        int a = 5, b = 7;
        int expected = 12;

        //when
        int actual = Calc.sum(a,b);

        //then
        assertEquals(expected, actual);
    }

    Calc calc = new Calc();

}
