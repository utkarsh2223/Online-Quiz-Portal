package com.quiz.model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    
    // Constructor, getters, and setters

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
    }
}
