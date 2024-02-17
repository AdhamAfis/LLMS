package com.example.saddemo;

public class BorrowDate {
    private int bookid;
    private BDate date;
    private StartDate startdate;
    private EndDate enddate;

    BorrowDate(int bookid , BDate date) {
        this.bookid = bookid;
        this.date = date;
        this.startdate = date.getStartDate();
        this.enddate = date.getEndDate();
    }


    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public BDate getDate() {
        return date;
    }

    public void setDate(BDate date) {
        this.date = date;
    }

    public StartDate getStartdate() {
        return startdate;
    }

    public void setStartdate(StartDate startdate) {
        this.startdate = startdate;
    }

    public EndDate getEnddate() {
        return enddate;
    }

    public void setEnddate(EndDate enddate) {
        this.enddate = enddate;
    }
}
