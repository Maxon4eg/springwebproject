package com.mate.spring.service;

import com.mate.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailSender mailSender;

    @Override
    public void send(User user) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(user.getEmail());
        message.setSubject("Hello Vova");
        message.setText("please confirm your registration.");
        mailSender.send(message);
    }
}
