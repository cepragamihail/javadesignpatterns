package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        System.out.println("Starting authentication process for user: " + username);
        return handler.handle(username, password);
    }

}
