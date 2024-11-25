package com.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.example.task1.Student;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .dob(LocalDate.of(2000, 1, 1))
                .grades(Arrays.asList(85, 90, 92))
                .mark(72)
                .mice(List.of("Mickey"))
                .mouse(null)
                .height(180)
                .build();

        System.out.println(student);
    }
}