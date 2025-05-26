package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public class UserExistsHandler  extends Handler {

    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    } 

    @Override
    public boolean handle(String username, String password) {
        System.out.println("Checking if user exists...");
        if (!database.isValidUser(username)) {
            
            System.out.println("User does not exist.");
            return false;
        }
        return handleNext(username, password);
    }

}
