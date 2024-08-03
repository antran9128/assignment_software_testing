package com.antran;

import com.antran.assignment2.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TinhTbcTests {
    @Test
    public void testMangRong(){
        int[] emptyArray = {};
        assertThrows(ArithmeticException.class, () -> MathUtil.tinhTrungBinhCong(emptyArray));
    }

    @Test
    public void testMang1PhanTu() {
        int[] array = {10};
        assertEquals(10, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMang2PhanTu() {
        int[] array = {10, 20};
        assertEquals(15, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMang3PhanTu() {
        int[] array = {10, 10, 10};
        assertEquals(10, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMang5PhanTu() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMang5PhanTuAm() {
        int[] array =  {-1, -2, -3, -4, -5};
        assertEquals(-3, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMang3PhanTuAmDuong() {
        int[] array = {-1, 0, 1};
        assertEquals(0, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMangPhanTu() {
        int[] array = {1000000, 2000000, 3000000};
        assertEquals(2000000.0, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMangPhanTu1() {
        int[] array = {0};
        assertEquals(0, MathUtil.tinhTrungBinhCong(array));
    }

    @Test
    public void testMangPhanTu2() {
        int[] array = {-1};
        assertEquals(-1, MathUtil.tinhTrungBinhCong(array));
    }
}
