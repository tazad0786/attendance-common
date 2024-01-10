package com.casestudy.attendencecommon.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DailyAttendanceEvent implements Serializable {

    private Integer employeeId;
    private String employeeName;
    private LocalDate date;
    private LocalDateTime swipeInTime;
    private LocalDateTime swipeOutTime;
    private LocalDateTime totalHours;
    private AttendanceStatus attendanceStatus;
    private String officeLocation;
}
