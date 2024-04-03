package org.omshinde;

import org.omshinde.functions.EventSortByLocation;
import org.omshinde.functions.EventSorterByDate;
import org.omshinde.models.Event;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Event> events=new ArrayList<>();

        events.add(new Event("Event 1", LocalDate.of(2023, 6, 15), null,null,"Mumbai"));
        events.add(new Event("Event 2", LocalDate.of(2023, 5, 21),null,null,"Delhi"));
        events.add(new Event("Event 3", LocalDate.of(2023, 7, 30),null,null,"Singapore"));
        events.add(new Event("Event 4", LocalDate.of(2023, 6, 1),null,null,"Navi Mumbai"));

        System.out.println("Events before Sorting - ");
        for(Event event: events){
            System.out.println(event.getTitle()+" - "+event.getDate());
        }
        System.out.println("--------------------");

        EventSorterByDate eventSorterByDate=new EventSorterByDate();
        eventSorterByDate.bubbleSortByDate(events);
        for(Event event: events){
            System.out.println(event.getTitle()+" - "+event.getDate());
        }
        System.out.println("--------------------");
        System.out.println("Event Sorted by Location");
        System.out.println("Before Sorting");
        for(Event event: events){
            System.out.println(event.getTitle()+" "+ event.getLocation());
        }
        System.out.println("--------------------");

        EventSortByLocation eventSortByLocation=new EventSortByLocation();
        eventSortByLocation.selectionSortByLocation(events);
        for(Event event: events){
            System.out.println(event.getTitle()+" "+ event.getLocation());
        }
    }
}