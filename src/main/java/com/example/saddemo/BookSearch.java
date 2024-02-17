package com.example.saddemo;

public class BookSearch implements IBookSearch {


    @Override
    public Boolean searchBybookCopyID(int id) {
   return  Database.searchBookbyID(id);
    }

    @Override
    public Boolean searchByauthor(String authorName) {
          return  Database.searchBookbyauthor(authorName);
    }

    @Override
    public Boolean searchBytitle(String bookTitle) {
             return  Database.searchBookbyTitle(bookTitle);
    }

    @Override
    public Boolean searchByStatus(Boolean status) {
   return  Database.searchBookbyStatus(status);
    }
}
