package com.infobasic.svilsw;

public class User {
    int id;
    static int nextId = 1;
    String name;
    String surname;
    String role; // Guest, Host, SuperHost
    String email;
    String address;

    public User(String name, String surname, String email, String address) {
        id = nextId;
        nextId++;
        this.name = name;
        this.surname = surname;
        this.role = "Guest";
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
