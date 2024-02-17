package com.example.saddemo.Authentication_Methods;

public interface IRegister {
    public void createAccount(int id, String password,String firstname , String lastname  , String email, String streetName, String countryName, String governName, String cityName, int blockNumber) throws Exception;
}
