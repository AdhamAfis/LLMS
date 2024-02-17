package com.example.saddemo;

public class User implements IPerson {
    private int id ;
    private String firstname ;
    private String lastname;
    private String email;
    private APersonAddress address;

    public User(int id, String firstname, String lastname, String email, APersonAddress address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
    }

    @Override
    public int getId(){return id;}
    @Override
    public void setId(int id) {}
    @Override
    public String getFirstname() {
        return firstname;
    }
    @Override
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Override
    public String getLastname() {
        return lastname;
    }
    @Override
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public APersonAddress getAddress() {
        return address;
    }
    @Override
    public void setAddress(APersonAddress address) {
        this.address = address;
    }
}
