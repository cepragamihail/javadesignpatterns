package com.java.design.patterns.begavioral.middleware;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware current = first;
        for (Middleware next : chain) {
            current.next = next;
            current = next;
        }
        return first;
    }
    public abstract boolean check(String email, String password);
    
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

}
