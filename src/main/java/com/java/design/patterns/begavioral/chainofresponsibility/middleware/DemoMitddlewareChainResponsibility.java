package com.java.design.patterns.begavioral.chainofresponsibility.middleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoMitddlewareChainResponsibility {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin");
        server.register("user@example.com", "user");

        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);  
    }

    public static void main(String[] args)  throws IOException{
        init();
        boolean success;
        do {
            System.out.print("Enter your email: ");
            String email = reader.readLine();
            System.out.print("Enter your password: ");
            String password = reader.readLine();
            success = server.LogIn(email, password);
        } while (!success);
    }

}
