package com.java.design.patterns.begavioral.chainofresponsibility.middleware;

public class ThrottlingMiddleware extends Middleware {
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.request = 0;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        long now = System.currentTimeMillis();
        if (now - currentTime > 60000) {
            request = 0;
            currentTime = now;
        }
        request++;
        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            return false;
        }
        return checkNext(email, password);
    }

}
