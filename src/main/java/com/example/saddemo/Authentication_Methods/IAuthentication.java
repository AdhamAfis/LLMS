package com.example.saddemo.Authentication_Methods;

import java.sql.SQLException;

public interface IAuthentication {

    public  boolean AuthenticationLogin(int id ,String password ) throws SQLException;
    public  void AuthenticationRegister(int id, String password,String firstname , String lastname  , String email, String streetName, String countryName, String governName, String cityName, int blockNumber) throws Exception;
}
