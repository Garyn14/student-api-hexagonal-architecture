package com.service.student.students.application.ports.input;

import com.service.student.students.domain.model.Student;

import java.util.List;

public interface StudentServicePort {
    Student findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    Student update(Long id, Student student);
    void deleteById(Long id);
}
