package org.example;

public class User {
   private int id;
   private String name;
   private String email;
   private boolean active;

    public User(boolean active, String email, int id, String name) {
        this.active = active;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActivado(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


