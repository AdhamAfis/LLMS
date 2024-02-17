package com.example.saddemo.Authentication_Methods;

import java.sql.SQLException;

public interface ILogin {

    public  boolean Authentication_account  (int id,String Password) throws SQLException;

}
