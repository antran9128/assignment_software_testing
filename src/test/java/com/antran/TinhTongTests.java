package com.antran;

import com.antran.assignment2.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhTongTests {
    @Test
    public void testSum2PositiveIntegerEquivalent(){
        assertEquals(5, MathUtil.add("2", "3"));
    }

    @Test
    public void testSum2NegativeIntegerEquivalent(){
        assertEquals(-5, MathUtil.add("-2", "-3"));
    }

    @Test
    public void testSum2IntegerEquivalent(){
        assertEquals(0, MathUtil.add("2", "-2"));
    }

    @Test
    public void testSum2IntegerBoundaryV1(){
        assertEquals(0, MathUtil.add(Integer.MIN_VALUE + "", -Integer.MIN_VALUE + ""));
    }

    @Test
    public void testSum2IntegerBoundaryV2(){
        assertEquals(Integer.MAX_VALUE, MathUtil.add(Integer.MAX_VALUE + "", "0"));
    }

    @Test
    public void testSum2IntegerBoundaryV3(){
        assertEquals(Integer.MIN_VALUE, MathUtil.add(Integer.MIN_VALUE + "", "0"));
    }

    @Test
    public void testSumWith0(){
        assertEquals(MathUtil.add("0", "1000"), 1000);
    }

    @Test
    public void testSumWithTwo0(){
        assertEquals(MathUtil.add("0", "0"), 0);
    }

    @Test
    public void testWithIncorrectInput(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.add("a", "1000");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }

    @Test
    public void testWithIncorrectInput2(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.add("", "");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }
    @Test
    public void testWithIncorrectInput3(){
        NumberFormatException exception = assertThrows(NumberFormatException.class, () -> {
            MathUtil.add("An", "Tran");
        });
        assertEquals(exception.getMessage(), "Input không hợp lệ, phải là số nguyên");
    }

}
