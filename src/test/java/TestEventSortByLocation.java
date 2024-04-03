import org.omshinde.functions.EventSortByLocation;
import org.omshinde.models.Event;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestEventSortByLocation {
    //first, create empty ArrayList of events
    ArrayList<Event> events=new ArrayList<>();
    @Test
    public void testTheArrayListIsEmpty(){
        //create instance of Class
        //call method with empty ArrayList
        //verify that ArrayList remains empty after sorting
        EventSortByLocation eventSortByLocation=new EventSortByLocation();
        //act
        eventSortByLocation.selectionSortByLocation(events);
        System.out.println(events);
        Assert.assertEquals(eventSortByLocation,null);
        //assert
        Assert.assertTrue(events.isEmpty());
    }

    @Test
    public void testTheArrayListIsAlreadySorted(){
        //pass the sorted ArrayList
        //call the method to sort
        //verify arraylist remains unchanged after sorting

        events.add(new Event("Event 1",null,null,null,"America"));
        events.add(new Event("Event 2",null,null,null,"Japan"));
        events.add(new Event("Event 1",null,null,null,"Malaysia"));
        events.add(new Event("Event 1",null,null,null,"Russia"));

        EventSortByLocation eventSortByLocation=new EventSortByLocation();
        //act
        eventSortByLocation.selectionSortByLocation(events);
        //assert
        Assert.assertEquals(events.get(0).getLocation(),"America");
        Assert.assertEquals(events.get(1).getLocation(),"Japan");
        Assert.assertEquals(events.get(2).getLocation(),"Malaysia");
        Assert.assertEquals(events.get(3).getLocation(),"Russia");
    }

    @Test
    public void testTheArrayListContainsNull(){
        //create arraylist with null locations
        //call method to sort
        //verify list is sorted correctly
        events.add(new Event("Event 1",null,null,null,"America"));
        events.add(new Event("Event 2",null,null,null,null));
        events.add(new Event("Event 1",null,null,null,"Malaysia"));
        events.add(new Event("Event 1",null,null,null,null));

        EventSortByLocation eventSortByLocation=new EventSortByLocation();
        //act
        eventSortByLocation.selectionSortByLocation(events);
        //assert
        Assert.assertNull(events.get(0).getLocation());
        Assert.assertNull(events.get(1).getLocation());
        Assert.assertEquals(events.get(2).getLocation(),"America");
        Assert.assertEquals(events.get(3).getLocation(),"Malaysia");

    }



}
