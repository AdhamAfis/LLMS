package com.example.saddemo;

public interface IBookSearch {
    public Boolean searchBybookCopyID(int id );
    public Boolean searchByauthor (String authorName);
    public Boolean searchBytitle (String bookTitle );
    public Boolean searchByStatus(Boolean status);



}
