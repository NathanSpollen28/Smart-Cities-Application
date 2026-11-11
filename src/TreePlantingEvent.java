/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author legoe
 */
public class TreePlantingEvent extends CommunityEvent {
    private int targetSaplingsCount;

    public TreePlantingEvent(String name, String date, String location, String description, int targetSaplingsCount) {
        super(name, date, location, description);
        this.targetSaplingsCount = targetSaplingsCount;
    }

    public int getTargetSaplingsCount() { return targetSaplingsCount; }
    public void setTargetSaplingsCount(int targetSaplingsCount) { this.targetSaplingsCount = targetSaplingsCount; }
}