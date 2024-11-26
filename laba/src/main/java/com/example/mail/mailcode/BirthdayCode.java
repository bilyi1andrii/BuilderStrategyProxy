package com.example.mail.mailcode;

import com.example.mail.Client;

public class BirthdayCode implements MailCode {

    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy Birthday!", client);
    }

}
