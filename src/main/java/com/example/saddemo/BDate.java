package com.example.saddemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.Duration;
import java.time.Period;
public class BDate {
    public LocalDate specificDate = LocalDate.now();
    private StartDate startDate;
    private EndDate endDate;
    public  int setRemainingDate(StartDate startDate , EndDate endDate){
        // Create a Duration object with the calculated difference in days
        int daysDifference = (int) ChronoUnit.DAYS.between(startDate.getStartDate(), endDate.getEndDate());
        return daysDifference;
    }
    // don't forget that I can write day being negative
    public BDate(StartDate startDate, EndDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public void setStartDate(StartDate startDate) {
        this.startDate = startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }

    public void setEndDate(EndDate endDate) {
        this.endDate = endDate;
    }

}
