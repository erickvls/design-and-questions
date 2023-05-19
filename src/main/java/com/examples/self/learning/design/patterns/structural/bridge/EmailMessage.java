package com.examples.self.learning.design.patterns.structural.bridge;

/**
 * RefinedAbstraction
 */
public class EmailMessage extends Message{

    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
