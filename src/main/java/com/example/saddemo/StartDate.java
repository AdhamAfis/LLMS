package com.example.saddemo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class StartDate extends ABDate implements IStartDate {
 private LocalDate startDate;


 public StartDate() {
  startDate = LocalDate.now();
 }

// public void setStartDate(int year, int month, int day) {
//  startDate = LocalDate.of(year, month, day);
// }

  public LocalDate getStartDate() {
    return startDate;
 }

}
