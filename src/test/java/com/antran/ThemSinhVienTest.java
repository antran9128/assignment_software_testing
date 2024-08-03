package com.antran;

import com.antran.assignment2.Sinhvienpoly;
import com.antran.assignment2.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThemSinhVienTest {
    Sinhvienpoly list = new Sinhvienpoly();

    @Test
    public void testAddValidStudent(){
        Student student = new Student("1", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        assertEquals(1 , list.getAll().size());
    }

    @Test
    public void testAddValidStudentV2(){
        Student student = new Student("2", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        assertEquals(1 , list.getAll().size());
    }

    @Test
    public void testAddStudentWithNameContainingNumber(){
        Student student = new Student("2", "01234567", "LO1", "PTPM", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên sinh viên phải là chữ, không được chứa ký tự đặc biệt");

    }

    @Test
    public void testAddStudentWithNameContainingSpecialKey(){
        Student student = new Student("2", "@#$%^", "LO1", "PTPM", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên sinh viên phải là chữ, không được chứa ký tự đặc biệt");
    }

    @Test
    public void testAddStudentWithEmptyName(){
        Student student = new Student("2", "", "LO1", "PTPM", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên sinh viên phải là chữ, không được chứa ký tự đặc biệt");
    }

    @Test
    public void testAddStudentWithClassNameContainingSpecialKey(){
        Student student = new Student("2", "An Tran", "LO1", "@#$%^", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên lớp phải là chữ, không được chứa ký tự đặc biệt");
    }

    @Test
    public void testAddStudentWithWithClassNameEmpty(){
        Student student = new Student("2", "An Tran", "LO1", "", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên lớp phải là chữ, không được chứa ký tự đặc biệt");
    }

    @Test
    public void testAddStudentWithWithClassNameNumber(){
        Student student = new Student("2", "An Tran", "LO1", "0123456", "PH39790");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            list.addStudent(student);
        });
        assertEquals(exception.getMessage(), "Tên lớp phải là chữ, không được chứa ký tự đặc biệt");
    }

    @Test
    public void testAddValidStudentV3(){
        Student student = new Student("1000", "Do Thi Phuong", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        assertEquals(1 , list.getAll().size());
    }

    @Test
    public void testAddValidStudentV4(){
        Student student = new Student("23", "An Tran", "LO1", "PTPM", "PH39790");
        list.addStudent(student);
        assertEquals(1 , list.getAll().size());
    }
}
