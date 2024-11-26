package com.example.mail.mailcode;

import com.example.mail.Client;

public class GiftCode implements MailCode {

    @Override
    public String generate(Client client) {
        return String.format("Hello %s! Were you really born at %s?"
        + " here is the gift suitable for %s!",
        client, client.getDob(), client.getSex());
    }

}
