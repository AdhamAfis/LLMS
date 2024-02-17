package com.example.saddemo;

public interface IPerson {

    public int getId();
    public void setId(int id);
    public String getFirstname();
    public void setFirstname(String firstname);
    public String getLastname();
    public void setLastname(String lastname);
    public String getEmail();
    public void setEmail(String email);
    public APersonAddress getAddress();
    public void setAddress(APersonAddress address);
}
