package com.casestudy.attendencecommon.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SwipeEvent {
    private Long employeeId;
    private LocalDateTime timestamp;
    private SwipeType swipeType;
    private String employeeName;
    private String officeLocation;
}