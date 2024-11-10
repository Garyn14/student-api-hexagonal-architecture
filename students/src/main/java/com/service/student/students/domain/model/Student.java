package com.service.student.students.domain.model;

import lombok.*;

@Builder @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
}
