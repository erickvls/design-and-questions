package com.examples.self.learning.design.patterns.structural.bridge;

/**
 * Concrete implementations
 */
public class TextMessageSender implements MessageSender{

    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
