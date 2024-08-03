package com.antran;

import com.antran.assignment2.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhHieuTest {
    @Test
    public void testSubtract2PositiveIntegerEquivalent(){
        assertEquals(-1, MathUtil.subtract("2", "3"));
    }

    @Test
    public void testSubtract2NegativeIntegerEquivalent(){
        assertEquals(1, MathUtil.subtract("-2", "-3"));
    }

    @Test
    public void testSubtract2IntegerEquivalent(){
        assertEquals(4, MathUtil.subtract("2", "-2"));
    }

    @Test
    public void testSubtract2IntegerBoundaryV1(){
        assertEquals(0, MathUtil.subtract(Integer.MIN_VALUE + "", Integer.MIN_VALUE + ""));
    }

    @Test
    public void testSubtract2IntegerBoundaryV2(){
        assertEquals(Integer.MAX_VALUE, MathUtil.subtract(Integer.MAX_VALUE + "", "0"));
    }

    @Test
    public void testSubtract2IntegerBoundaryV3(){
        assertEquals(Integer.MIN_VALUE, MathUtil.subtract(Integer.MIN_VALUE + "", "0"));
    }

    @Test
    public void testSubtractWith0(){
        assertEquals(MathUtil.subtract("0", "1000"), -1000);
    }

    @Test
    public void testSubtractWithTwo0(){
        assertEquals(MathUtil.subtract("0", "0"), 0);
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
