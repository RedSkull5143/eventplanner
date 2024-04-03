package org.omshinde.functions;

import org.omshinde.models.Event;

import java.util.ArrayList;

public class EventSortByLocation {
    public void selectionSortByLocation(ArrayList<Event> events){
        int sizeOfEvents=events.size();
        for(int i=0;i<sizeOfEvents-1;i++){
            int smallest=i;
            for(int j=i+1;j<sizeOfEvents;j++){
                if(events.get(j).getLocation().compareTo(events.get(smallest).getLocation())<0){
                    smallest=i;
                }
            }
            if(smallest!=i){
                Event temp=events.get(smallest);
                events.set(smallest,events.get(i));
                events.set(i,temp);
            }
        }
    }
}
