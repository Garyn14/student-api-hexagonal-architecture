package com.service.student.students.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class StudentCreateRequest {
    @NotBlank(message = "Firstname may not be empty")
    private String firstname;
    @NotBlank(message = "Lastname may not be empty")
    private String lastname;
    @NotNull(message = "Age may not be empty")
    private Integer age;
    @NotBlank(message = "Address may not be empty")
    private String address;
}
