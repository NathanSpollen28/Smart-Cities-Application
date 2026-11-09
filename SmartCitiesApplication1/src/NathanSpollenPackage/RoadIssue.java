/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NathanSpollenPackage;

/**
 *
 * @author Nathan Spollen
 */
public class RoadIssue extends Issue {
    
    private int roadCode;
    private String roadType;

    public RoadIssue(int id, String issueName, String issueDate, String issueLocation, boolean resolved,int roadCode, String roadType) {
        super(id,issueName,issueDate,issueLocation,resolved);
        this.roadCode = roadCode;
        this.roadType = roadType;
    }
    public int getRoadCode() {
        return roadCode;
    }

    public void setRoadCode(int roadCode) {
        this.roadCode = roadCode;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }
    @Override
    public String displayDetails(){
        return super.displayDetails()+"\nRoad Code: "+roadCode+"\nRoad Type: "+roadType;
    
    }
    
    
}
