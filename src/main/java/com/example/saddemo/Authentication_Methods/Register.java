package com.example.saddemo.Authentication_Methods;

import com.example.saddemo.*;

public class Register implements IRegister {
    @Override
    public void createAccount(int id, String password,String firstname , String lastname  , String email, String streetName, String countryName, String governName, String cityName, int blockNumber) throws Exception {
        ACountry country = new ACountry(countryName);
       // AGovern govern = new Govern(governName,country);
        System.out.println("leh keda 2");
        GovernFactory govern = new GovernFactory();
        GovernType type = govern.getAddressType(governName );
        ACity city = new City(cityName,type);


        AAddress address = new Address(streetName,blockNumber,city);
        APersonAddress personAddress = new PersonAddress(address);
        IPerson user = new User(id,firstname ,  lastname  ,  email,personAddress);
        Database.register(user.getId(),password, user.getFirstname() ,  user.getLastname()  ,  user.getEmail(),  streetName,  countryName,  type.getName(),  cityName,  blockNumber);
    }
}
