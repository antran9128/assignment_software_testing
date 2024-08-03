package com.antran;

import com.antran.assignment2.Sinhvienpoly;
import com.antran.assignment2.Student;
import com.antran.assignment2.StudentNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TimTheoMaSinhVienTest {
    Sinhvienpoly list = new Sinhvienpoly();

    @Test
    public void testSearchStudentSuccessfully() throws StudentNotFoundException {
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        Student findStudent = list.findByStudentId("PH39790");
        assertEquals("An Tran" , findStudent.getHoTen());
    }

    @Test
    public void testSearchInvalidId(){
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.findByStudentId("@#$%^&");
        });
        assertEquals(exception.getMessage(), "Vui lòng nhập mã sinh viên hợp lệ");

    }

    @Test
    public void testSearchEmptyId(){
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.findByStudentId("");
        });
        assertEquals(exception.getMessage(), "Vui lòng nhập mã sinh viên hợp lệ");

    }

    @Test
    public void testSearchStudentNotFound1(){
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        StudentNotFoundException exception = assertThrows(StudentNotFoundException.class, () -> {
            list.findByStudentId("PH39791");
        });
        assertEquals(exception.getMessage(), "Không tìm thấy sinh viên có mã PH39791");

    }

    @Test
    public void testSearchStudentNotFound2(){
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        StudentNotFoundException exception = assertThrows(StudentNotFoundException.class, () -> {
            list.findByStudentId("PH39792");
        });
        assertEquals(exception.getMessage(), "Không tìm thấy sinh viên có mã PH39792");

    }
}
