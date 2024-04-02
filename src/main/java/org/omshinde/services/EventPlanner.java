package org.omshinde.services;

import org.omshinde.models.Event;

import java.util.ArrayList;
import java.util.List;

public class EventPlanner {
    private List<Event> events;

    public EventPlanner() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> getEvents(){
        return this.events;
    }
    public void displayEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}