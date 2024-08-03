package com.antran.assignment2;

public class MathUtil {
    public static int add(String num1, String num2){
        try {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            return number1 + number2;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input không hợp lệ, phải là số nguyên");
        }
    }

    public static int subtract(String num1, String num2){
        try {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            return number1 - number2;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input không hợp lệ, phải là số nguyên");
        }
    }

    public static int multiply(String num1, String num2){
        try {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            return number1 * number2;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input không hợp lệ, phải là số nguyên");
        }
    }

    public static int truyXuatPhanTuMang(int index, int [] array){
        return array[index];
    }

    public static double tinhTrungBinhCong(int[] mang){
        if(mang.length == 0){
            throw new ArithmeticException("Mang rong - khong the chia cho 0");
        }
        int tong = 0;
        for (int a : mang
        ) {
            tong += a;
        }
        return (double) tong / mang.length;
    }

}
