package com.service.student.students.infrastructure.adapters.output.persistence.mapper;

import com.service.student.students.domain.model.Student;
import com.service.student.students.infrastructure.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {
    StudentEntity toStudentEntity(Student student);
    Student toStudent(StudentEntity studentEntity);
    List<Student> toStudentList(List<StudentEntity> studentEntityList);
}