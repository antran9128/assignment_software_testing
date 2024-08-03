package com.antran;

import com.antran.assignment2.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhNhanTest {
    @Test
    public void multiplyWith0(){
        assertEquals(0, MathUtil.multiply("1000", "0"));
    }

    @Test
    public void multiply0With0(){
        assertEquals(0, MathUtil.multiply("0", "0"));
    }

    @Test
    public void multiplyWith1(){
        assertEquals(1000, MathUtil.multiply("1000", "1"));
    }

    @Test
    public void multiply2PositiveNumberV2(){
        assertEquals(60000, MathUtil.multiply("200", "300"));
    }

    @Test
    public void multiply2NegativeNumber(){
        assertEquals(6, MathUtil.multiply("-2", "-3"));
    }

    @Test
    public void multiply2NegativeNumberV2(){
        assertEquals(60000, MathUtil.multiply("-200", "-300"));
    }

    @Test
    public void multiply2Number(){
        assertEquals(-6, MathUtil.multiply("-2", "3"));
    }

    @Test
    public void testWithIncorrectInput(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.multiply("a", "1000");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }

    @Test
    public void testWithIncorrectInput2(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.multiply("", "");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }
    @Test
    public void testWithIncorrectInput3(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.multiply("An", "Tran");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }
}
