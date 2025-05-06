package com.java.design.patterns.begavioral.middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Middleware middleware;
    private Map<String, String> users = new HashMap<>();

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }
    public boolean LogIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization has been successful!");
            return true;
        }
        return false;
    }
    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }

}
