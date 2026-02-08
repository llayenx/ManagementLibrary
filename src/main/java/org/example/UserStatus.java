package org.example;

public enum UserStatus {
    ACTIVE( "User active"),
    INACTIVE("User inactive");

    private String status;

    UserStatus(String status) {
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
}

