package org.omshinde.functions;

import org.omshinde.models.Event;

import java.util.ArrayList;

public class EventSorter {
    public static void bubbleSortByDate(ArrayList<Event> events){
        int noOfEvents=events.size();
        boolean swapped;

        for(int i=0;i<noOfEvents-1;i++){
            swapped=false;
            for(int j=0;j<noOfEvents-i-1;j++){
                if(events.get(j).getDate().isAfter(events.get(j+1).getDate())){
                    Event temp=events.get(j);
                    events.set(j,events.get(j+1));
                    events.set(j+1,temp);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

//sort

