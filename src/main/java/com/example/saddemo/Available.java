package com.example.saddemo;


public class Available extends State {
    public Available(int Bookid ) {
        super(Bookid);
    }

    @Override
    public boolean isFound() {
        return true;
    }
}
