package com.quiz.model;

public class Quiz {
    private int id;
    private String name;
    private String description;
    
    // Constructor, getters, and setters

    @Override
    public String toString() {
        return "Quiz [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
