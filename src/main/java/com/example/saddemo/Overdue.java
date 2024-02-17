package com.example.saddemo;

import java.time.temporal.ChronoUnit;

public class Overdue {
    private BorrowDate date;
    public Overdue(BorrowDate date){
        this.date= date;
    }

    public boolean isOverdue(){
        if (date.getDate().specificDate.isAfter(date.getEnddate().getEndDate())){
            return true;
        }
        else return false;
    }
}
