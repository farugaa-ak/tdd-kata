package pl.akademia;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCalculatorTest {

    private StringCalculator stringCalculator =new StringCalculator();

    @Test
    public void shouldCountSumWHenEmptyString(){
        //given
        String s = "";

        //when
        int add = stringCalculator.add(s);

        //then
        assertThat(add, is(0));
    }

    @Test
    public void shouldCountSumWHenOneNumber(){
        //given
        String s = "1";

        //when
        int add = stringCalculator.add(s);

        //then
        assertThat(add, is(1));
    }

    @Test
    public void shouldCountSum(){
        //given
        String s = "1,2";

        //when
        int add = stringCalculator.add(s);
        //then
        assertThat(add, is(3));
    }

}