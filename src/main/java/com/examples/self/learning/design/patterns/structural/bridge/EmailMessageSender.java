package com.examples.self.learning.design.patterns.structural.bridge;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
