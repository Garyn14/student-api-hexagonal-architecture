package com.service.student.students.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder @Getter
public class ErrorResponse {
    private String code;
    private String message;
    private List<String> details;
    private LocalDateTime timeStamp;
}
