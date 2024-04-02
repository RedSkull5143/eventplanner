import org.junit.jupiter.api.Test;
import org.omshinde.models.Event;
import org.omshinde.services.EventPlanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventPlannerTest {
    @Test
    public void testAddEvent() {
        EventPlanner eventPlanner = new EventPlanner();
        Event event = new Event("Gradle Course Launch", "2023-06-02", "Online");
        eventPlanner.addEvent(event);
        assertEquals(6, eventPlanner.getEvents().size());
        System.out.println(eventPlanner.getEvents().size());
        assertEquals(event, eventPlanner.getEvents().get(0));
    }
}