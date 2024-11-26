package com.example.mail;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.Transport;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

import java.util.Properties;

public class MailSender {
    private final Properties properties;

    public MailSender(String configPath) {
        this.properties = ConfigLoader.loadConfig(configPath);
    }

    public void sendMail(MailInfo mailInfo) {
        String email = properties.getProperty("email.address");
        String password = properties.getProperty("email.password");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO, InternetAddress
                   .parse(mailInfo.getEmail()));
            message.setSubject("Subject: " + mailInfo.getMailCode());
            message.setText(mailInfo.generate());

            Transport.send(message);
            System.out.println("Email sent successfully to "
            + mailInfo.getEmail());

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}