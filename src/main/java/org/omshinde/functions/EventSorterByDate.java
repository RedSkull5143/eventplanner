package org.omshinde.functions;

import org.omshinde.models.Event;

import java.util.ArrayList;

public class EventSorterByDate {
    public void bubbleSortByDate(ArrayList<Event> events){
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

//bubble-sort
//from first element to size-1
//if value at is greater than right adjacent element, shift

