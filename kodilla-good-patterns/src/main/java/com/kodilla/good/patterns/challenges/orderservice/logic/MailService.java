package com.kodilla.good.patterns.challenges.orderservice.logic;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Sending mail with bill to " + user.getName() + " " + user.getSurname());
    }
}
