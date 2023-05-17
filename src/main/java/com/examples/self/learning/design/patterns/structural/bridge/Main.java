package com.examples.self.learning.design.patterns.structural.bridge;

/**
 * See Problem.md
 */
public class Main {
    public static void main(String[] args) {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
