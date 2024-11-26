package com.example.builder;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

@Getter @Builder @ToString
public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dob;

    @Singular("mark")
    private List<Integer> grades;
    @Singular
    private List<String> mice;
    private int height;

}
