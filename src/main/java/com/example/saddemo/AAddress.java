package com.example.saddemo;

public abstract class AAddress {
    private  String streetName;
    private int blockNumb;
    private  ACity city;
    public AAddress(String streetName, int blockNumb, ACity City) {
        this.city=City;
        this.streetName = streetName;
        this.blockNumb = blockNumb;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public int getBlockNumb() {
        return blockNumb;
    }
    public void setBlockNumb(int blockNumb) {
        this.blockNumb = blockNumb;
    }


    @Override
    public String toString() {
        return "Address :\n" +
                "\n,\t\t  Street Name='" + streetName + '\'' +
                "\n,\t\t  Block Number=" + blockNumb +
                "\n,\t\t  City Name=" + city.getName()+

                '.';
    }
}
