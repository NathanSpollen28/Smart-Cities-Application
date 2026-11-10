/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author legoe
 */
public class CommunityEvent {
    private String name;
    private String date;
    private String location;
    private String description;
    
    public CommunityEvent(String name, String date, String location, String description){
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
       }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
    
   