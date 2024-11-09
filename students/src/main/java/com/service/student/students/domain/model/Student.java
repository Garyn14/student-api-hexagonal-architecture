package com.service.student.students.domain.model;

import lombok.*;

@Builder @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastname;
    private Integer age;
    private String address;
}
