package org.omshinde;

import org.omshinde.functions.EventSorter;
import org.omshinde.models.Event;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Event> events=new ArrayList<>();

        events.add(new Event("Event 1", LocalDate.of(2023, 6, 15), null,null));
        events.add(new Event("Event 2", LocalDate.of(2023, 5, 21),null,null));
        events.add(new Event("Event 3", LocalDate.of(2023, 7, 30),null,null));
        events.add(new Event("Event 4", LocalDate.of(2023, 6, 1),null,null));

        System.out.println("Events before Sorting - ");
        for(Event event: events){
            System.out.println(event.getTitle()+" - "+event.getDate());
        }
        System.out.println("--------------------");

        EventSorter.bubbleSortByDate(events);
        for(Event event: events){
            System.out.println(event.getTitle()+" - "+event.getDate());
        }
    }
}