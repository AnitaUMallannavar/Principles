package com.xworkz.application.dto.runner;

import java.time.LocalDate;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceDTORunner {

	public static void main(String[] args) {
		AttendanceDTO attendanceDTO=new AttendanceDTO();
		attendanceDTO.setName("Asha");
		attendanceDTO.setNoOfDaysPresent(43);
		attendanceDTO.setNoOfDaysAbsent(34);
		attendanceDTO.setRegular(false);
		attendanceDTO.setLocalDate(LocalDate.now());
		System.out.println(attendanceDTO);

	}

}
