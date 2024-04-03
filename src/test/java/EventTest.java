import org.omshinde.models.Event;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventTest {
    ArrayList<Event> events=new ArrayList<>();
    @Test
    public void a(){
        //check the size of Event ArrayList
        events.add(new Event("Event 1", LocalDate.of(2023, 6, 15), null,null));
        System.out.println(events.size());
        Assert.assertEquals(events.size(),1);
        System.out.println("Test 1");
    }

    @Test
    public void b(){
        //check the details of the Event
        events.add(new Event("Event 2", LocalDate.of(2023, 6, 15), null,null));
        Assert.assertEquals(events.get(1).getTitle(),"Event 2");
        System.out.println("Test 2");
    }

    @Test
    public void c(){
        //add event
        //retrieve the event
        //modify its title
        //set it back to the arraylist
        events.add(new Event("Event 3", LocalDate.of(2023, 6, 15), null, null));
        Event event = events.get(0);
//        System.out.println(event);
        event.setTitle("Om Shinde");
//        events.set(0, event);
        System.out.println(events.size());
//        System.out.println(events.get(1).getTitle());
        System.out.println("Test 3.1");
        Assert.assertEquals(events.get(0).getTitle(),"Om Shinde");
        System.out.println("Test 3");
    }
}
