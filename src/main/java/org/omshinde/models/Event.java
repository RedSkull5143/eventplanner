package org.omshinde.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
    private String title;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;

    public Event(String title, LocalDate date, LocalTime startTime, LocalTime endTime, String location){
        this.title=title;
        this.date=date;
        this.startTime=startTime;
        this.endTime=endTime;
        this.location=location;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getLocation(){
        return location=location;
    }

    public void setLocation(String location){
        this.location=location;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Title : ").append(title).append("\nDate : ").append(date).append("\nStart Time : ").append(startTime).append("\nEnd Time : ").append(endTime).append("\nLocation : ").append(location);

        return stringBuilder.toString();
    }
}