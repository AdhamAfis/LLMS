package com.example.saddemo;

public abstract class APersonAddress {
    private AAddress address;
    public APersonAddress( AAddress Address) {
        this.address = Address;
    }
    public AAddress getAddress() {
        return address;
    }
    public void setAddress(AAddress address) {
        this.address = address;
    }
}
