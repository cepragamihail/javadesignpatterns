package com.java.design.patterns.begavioral.middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Welcome, admin!");
            return true;
        }
        System.out.println("You are not an admin.");
        return checkNext(email, password);
    }

}
