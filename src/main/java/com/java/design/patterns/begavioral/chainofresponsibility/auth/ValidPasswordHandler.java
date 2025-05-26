package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public class ValidPasswordHandler extends Handler {

    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        System.out.println("Validating password for user: " + username);
            if (database.isValidPassword(username, password)) {
                System.out.println("Password is valid.");
                return handleNext(username, password);
            } else {
                System.out.println("Invalid password for user: " + username);
                return false;
            }
    }

}
