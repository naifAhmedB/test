package com.example.asem.presenter;

import com.example.asem.model.repo.Interface.iLogin;

public class Login{

    private iLogin login;

    public Login(iLogin login) {
        this.login = login;
    }

    public Login() {

    }

    public boolean pLogin(String name, String pass)
    {

        return login.validation(name, pass);
    }

}
