package com.examples.self.learning.design.patterns.behavioral.cor;

/**
 * Base Handler class
 */
public abstract class LeaveHandler {
    protected LeaveHandler nextHandler;
    public LeaveHandler setNextHandler(LeaveHandler handler){
        this.nextHandler = handler;
        return this;
    }

    public abstract String applyLeave(Leave leave);
}
