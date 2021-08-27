package com.example.domain;

public class User {
    private Integer userage;
    private String username;


    public User(Integer userage, String username) {
        this.userage = userage;
        this.username = username;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
