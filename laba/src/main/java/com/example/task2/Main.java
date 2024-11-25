package com.example.task2;

import java.time.LocalDate;

import com.example.task2.mailcode.BirthdayCode;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(
                                    "",
                                    "Oles",
                                    LocalDate.of(2006, 12, 12),
                                    "male"
                                );

        MailInfo mailInfo = new MailInfo(client, new BirthdayCode());

        System.out.println(mailInfo.generate());
    }
}
