package com.examples.self.learning.design.patterns.structural.bridge;

public abstract class Message {
    protected final MessageSender messageSender;

    public Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    abstract public void send();
}
