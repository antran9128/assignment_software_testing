package com.antran;

import com.antran.assignment2.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TruyXuatPhanTuTest {
    private int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    @Test
    public void testCase1(){
        assertEquals(1, MathUtil.truyXuatPhanTuMang(0, array));
    }

    @Test
    public void testCase2(){
        assertEquals(2, MathUtil.truyXuatPhanTuMang(1, array));
    }

    @Test
    public void testCase3(){
        assertEquals(3, MathUtil.truyXuatPhanTuMang(2, array));
    }

    @Test
    public void testCase4(){
        assertEquals(4, MathUtil.truyXuatPhanTuMang(3, array));
    }

    @Test
    public void testCase5(){
        assertEquals(5, MathUtil.truyXuatPhanTuMang(4, array));
    }

    @Test
    public void testCase6(){
        assertEquals(6, MathUtil.truyXuatPhanTuMang(5, array));
    }

    @Test
    public void testCase7(){
        assertThrows(IndexOutOfBoundsException.class, () -> MathUtil.truyXuatPhanTuMang(-1, array));
    }

    @Test
    public void testCase8(){
        assertThrows(IndexOutOfBoundsException.class, () -> MathUtil.truyXuatPhanTuMang(array.length, array));
    }

    @Test
    public void testCase9(){
        assertEquals(7, MathUtil.truyXuatPhanTuMang(6, array));
    }

    @Test
    public void testCase10(){
        assertEquals(8, MathUtil.truyXuatPhanTuMang(7, array));
    }
}
