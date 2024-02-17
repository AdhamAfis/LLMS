package com.example.saddemo.Authentication_Methods;

import com.example.saddemo.Database;

import java.sql.SQLException;

public class Login implements ILogin {

    @Override
    public boolean Authentication_account(int id, String Password) throws SQLException {
             return Database.user_login_check_info(id,Password);
    }
}
