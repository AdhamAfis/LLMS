package com.example.saddemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EndDate extends ABDate implements IEndDate {
    private LocalDate endDate;

    public EndDate() {
    }

    public EndDate(int year, int month, int day) {
        endDate = LocalDate.of(year, month, day);
    }

    public void setEndDate(int year, int month, int day) {
        endDate = LocalDate.of(year, month, day);
    }

    public LocalDate getEndDate() {
       return endDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return formatter.format(endDate);
    }

}
