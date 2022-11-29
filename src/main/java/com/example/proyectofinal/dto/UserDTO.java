package com.example.proyectofinal.dto;

public class UserDTO {
    private String username;
    private Integer age;
    private String service;
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDTO(String username, Integer age, String service, String id) {
        this.username = username;
        this.age = age;
        this.service = service;
        this.id = id;
    }
}
