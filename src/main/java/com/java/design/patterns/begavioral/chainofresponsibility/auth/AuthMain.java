package com.java.design.patterns.begavioral.chainofresponsibility.auth;

public class AuthMain {
    public static void main(String[] args) {
        // Create the database
        Database database = new Database();

        Handler handler = new UserExistsHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler("admin"));

        // Create the authentication service
        AuthService authService = new AuthService(handler);

        // Test authentication
        System.out.println("Authentication result: " + authService.logIn("admin_user", "admin_password"));
        System.out.println("Authentication result: " + authService.logIn("user1", "password1"));
        System.out.println("Authentication result: " + authService.logIn("user2", "wrong_password"));
    }

}
