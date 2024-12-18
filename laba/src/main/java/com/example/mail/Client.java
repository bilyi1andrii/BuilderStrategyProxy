package com.example.mail;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Client {
    private static int counter;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private String sex;
    private String email;

    public Client(String email, String name, LocalDate dob, String sex) {
        this.email = email;
        this.name = name;
        this.dob = dob;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name;
    }
}
