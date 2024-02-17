package com.example.saddemo.Authentication_Methods;

import java.sql.SQLException;

public class Authentication implements IAuthentication{
    private ILogin  login  = new Login();
    private IRegister register  = new Register();

    @Override
    public boolean AuthenticationLogin(int id, String password) throws SQLException {
    return login.Authentication_account(id,password);
    }

    @Override
    public void AuthenticationRegister(int id, String password,String firstname , String lastname  , String email, String streetName, String countryName, String governName, String cityName, int blockNumber) throws Exception {
     register.createAccount(id,password,firstname,lastname,email,streetName,countryName,governName,cityName,blockNumber);
    }
}
