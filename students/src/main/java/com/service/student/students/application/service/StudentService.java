package com.service.student.students.application.service;

import com.service.student.students.application.ports.input.StudentServicePort;
import com.service.student.students.application.ports.output.StudentPersistencePort;
import com.service.student.students.domain.exception.StudentNotFoundException;
import com.service.student.students.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// implement the input port and use the output port
@Service
@RequiredArgsConstructor
public class StudentService implements StudentServicePort {

    private final StudentPersistencePort persistencePort;

    @Override
    public Student findById(Long id) {
        return persistencePort
                .findById(id)
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public List<Student> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public Student save(Student student) {
        return persistencePort.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        return persistencePort.findById(id)
                .map(studentToUpdate -> {
                    studentToUpdate.setFirstname(student.getFirstname());
                    studentToUpdate.setLastname(student.getLastname());
                    studentToUpdate.setAge(student.getAge());
                    studentToUpdate.setAddress(student.getAddress());
                    return persistencePort.save(studentToUpdate);
                })
                .orElseThrow(StudentNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) throw new StudentNotFoundException();
        persistencePort.deleteById(id);
    }
}
