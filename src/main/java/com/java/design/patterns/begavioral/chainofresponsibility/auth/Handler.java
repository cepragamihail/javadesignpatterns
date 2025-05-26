package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }
    
    public abstract boolean handle(String username, String password);
    
    protected boolean handleNext(String username, String password) {
        System.out.println("Checking next handler...");
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}
