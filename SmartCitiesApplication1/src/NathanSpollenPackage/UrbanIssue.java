/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NathanSpollenPackage;

/**
 *
 * @author Nathan Spollen
 */
public class UrbanIssue extends Issue{
    private int areaCode;
    private String areaType;

    public UrbanIssue(int id, String issueName, String issueDate, String issueLocation, boolean resolved,int areaCode, String areaType) {
        super(id, issueName, issueDate, issueLocation, resolved);
        this.areaCode = areaCode;
        this.areaType = areaType;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }
    
    @Override
    public String displayDetails(){
        return super.displayDetails()+"\nsArea Code: "+areaCode+"\nArea Type:"+areaType;
    
    }

   
    
    
    
}
