package com.antran.assignment2;

public class Student {
    private String id;
    private String hoTen;
    private String maLop;
    private String tenLop;
    private String maSv;

    public Student() {
    }

    public Student(String id, String hoTen, String maLop, String tenLop, String maSv) {
        this.id = id;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maSv = maSv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
}
