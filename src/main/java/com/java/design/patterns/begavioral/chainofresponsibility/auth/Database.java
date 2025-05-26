package com.java.design.patterns.begavioral.chainofresponsibility.auth;

import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        this.users = Map.of(
            "admin_user", "admin_password",
            "user1", "password1",
            "user2", "password2");
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }

}
