package com.antran.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Sinhvienpoly {
    private List<Student> listStudents;

    public Sinhvienpoly() {
        this.listStudents = new ArrayList<>();
    }

    public List<Student> getAll(){
        return listStudents;
    }

    public void addStudent(Student student) {
        if (!student.getHoTen().matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Tên sinh viên phải là chữ, không được chứa ký tự đặc biệt");
        }

        if (!student.getTenLop().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Tên lớp phải là chữ, không được chứa ký tự đặc biệt");
        }


        listStudents.add(student);
        System.out.println("Them thanh cong");
    }

    public Student findByStudentId(String id) throws StudentNotFoundException {
        if (!id.matches("[a-zA-Z0-9]+")){
            throw new IllegalArgumentException("Vui lòng nhập mã sinh viên hợp lệ");
        }

        Student student = null;

        for (Student s: listStudents) {
            if(s.getMaSv().equalsIgnoreCase(id)){
                student = s;
                break;
            }
        }

        if(student == null){
            throw new StudentNotFoundException("Không tìm thấy sinh viên có mã " + id);
        }

        return student;
    }

}
