package com.example.asem.model.repo;

import com.example.asem.model.repo.Interface.iLogin;

public class Login implements iLogin {

    public boolean validation(String name, String pass)
    {
        if (name.equalsIgnoreCase("naif") && pass.equalsIgnoreCase("123"))
        {
            return true;
        }
        return false;
    }

}
