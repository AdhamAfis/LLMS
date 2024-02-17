package com.example.saddemo;

import com.example.saddemo.Book;
import com.example.saddemo.IBook;

public abstract class State {
    private  int bookid ;

    public State (int bookid  ) {
      this.bookid=bookid;
    }

    public abstract boolean isFound();
}
