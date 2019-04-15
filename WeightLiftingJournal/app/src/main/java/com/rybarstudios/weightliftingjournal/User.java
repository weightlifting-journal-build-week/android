package com.rybarstudios.weightliftingjournal;

public class User {

    private String name, username, email, password;
    private int id, height, weight;

    public User(String name, String username, String email, String password, int id, int height, int weight) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
