package com.example.proyectofinal.model;

public class User {
    private String username;
    private String password;
    private Integer age;
    private String id;
    private String service;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public User(String username, String password, Integer age, String id, String service) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.id = id;
        this.service = service;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", identification='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
