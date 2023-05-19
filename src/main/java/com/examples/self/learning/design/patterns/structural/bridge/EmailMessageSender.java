package com.examples.self.learning.design.patterns.structural.bridge;

/**
 * Concrete implementations
 */
public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
