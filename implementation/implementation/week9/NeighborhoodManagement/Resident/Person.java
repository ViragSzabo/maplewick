package implementation.week9.NeighborhoodManagement.Resident;

import implementation.week9.NeighborhoodManagement.Event.NeighborhoodEvent;

public interface Person {
    String getFullName();
    void attendEvent(NeighborhoodEvent event);
}