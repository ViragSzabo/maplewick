package implementation.week9.EventPlanningAndTicketing;

import implementation.week9.EventPlanningAndTicketing.Events.MaplewickEvent;

import java.util.ArrayList;

public class Management
{
    private ArrayList<MaplewickEvent> events;

    public Management()
    {
        this.events = new ArrayList<>();
    }

    public ArrayList<MaplewickEvent> getAllEvents()
    {
        return this.events;
    }

    public void addEvent(MaplewickEvent e)
    {
        this.events.add(e);
    }

    public void cancelEvent(MaplewickEvent e)
    {
        this.events.remove(e);
    }

    public void viewCurrentEvents()
    {
        System.out.println("📅 Current Events in Maplewick:");
        for(MaplewickEvent e : this.events)
        {
            e.showEventInfo();
        }
    }
}