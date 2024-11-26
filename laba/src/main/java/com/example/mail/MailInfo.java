package com.example.mail;

import com.example.mail.mailcode.MailCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MailInfo {
    private Client client;
    private MailCode mailCode;


    public String generate() {
        return mailCode.generate(client);
    }

    public String getEmail() {
        return client.getEmail();
    }

}
