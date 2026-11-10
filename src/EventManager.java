/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author legoe
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventManager {
    private ArrayList<CommunityEvent> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void addEvent(CommunityEvent event) {
        events.add(event);
    }

    public ArrayList<CommunityEvent> getAllEvents() {
        return events;
    }

    public List<CommunityEvent> searchEvents(String keyword) {
        String lowerKeyword = keyword.toLowerCase();
        return events.stream()
                .filter(e -> e.getName().toLowerCase().contains(lowerKeyword) || 
                             e.getLocation().toLowerCase().contains(lowerKeyword))
                .collect(Collectors.toList());
    }

    public boolean deleteEvent(String eventName) {
        CommunityEvent eventToDelete = null;
        for (CommunityEvent event : events) {
            if (event.getName().equalsIgnoreCase(eventName)) {
                eventToDelete = event;
                break;
            }
        }
        if (eventToDelete != null) {
            events.remove(eventToDelete);
            return true;
        }
        return false;
    }
}