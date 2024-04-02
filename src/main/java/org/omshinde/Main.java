package org.omshinde;

import org.omshinde.models.Event;
import org.omshinde.services.EventPlanner;

public class Main {
    public static void main(String[] args) {
        EventPlanner eventPlanner = new EventPlanner();
        eventPlanner.addEvent(new Event("Automation Ultralesson", "2024-03-24", "QK Office"));
        eventPlanner.addEvent(new Event("Saurav Mundan", "2024-04-02", "Amravati"));
        eventPlanner.displayEvents();
    }
}