package com.Mindhub.android.ejemplofragmentdinamicos;

public class UserModel {

    public UserModel() {
    }

    public UserModel(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
