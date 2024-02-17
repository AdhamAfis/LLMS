package com.example.saddemo;

import java.time.temporal.ChronoUnit;

public class OverDueFineCalculator  implements IOverDueFineCalculator{
    private BDate bdate;
        @Override
        public double calculateOverdueFine(StartDate startDate, EndDate endDate) {
        int date = bdate.setRemainingDate(startDate,endDate);
        return date * 0.1;
    }
}
