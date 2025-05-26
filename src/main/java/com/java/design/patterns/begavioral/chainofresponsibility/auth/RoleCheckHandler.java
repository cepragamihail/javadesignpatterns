package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public class RoleCheckHandler extends Handler {

    private final String requiredRole;

    public RoleCheckHandler(String requiredRole) {
        this.requiredRole = requiredRole;
    }

    @Override
    public boolean handle(String username, String password) {
        System.out.println("Checking role for user: " + username);
        // Simulate role check logic
        if ("admin_user".equals(username) && "admin".equals(requiredRole)) {
            System.out.println("User has the required role: " + requiredRole);
            return handleNext(username, password);
        } else {
            System.out.println("User does not have the required role: " + requiredRole);
            return false;
        }
    }

}
