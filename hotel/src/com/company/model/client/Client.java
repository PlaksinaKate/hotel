package com.company.model.client;

public class Client {
    private String name;
    private int passport;
    private int phone;

    public Client(String name, int passport, int phone) {
        this.name = name;
        this.passport = passport;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
