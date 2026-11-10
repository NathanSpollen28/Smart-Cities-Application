/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NathanSpollenPackage;

/**
 *
 * @author Nathan Spollen
 */
public class Issue {
    protected int id;
    protected String issueName;
    protected String issueDate;
    protected String issueLocation;
    protected boolean resolved;

    public Issue(int id, String issueName, String issueDate, String issueLocation, boolean resolved) {
        this.id = id;
        this.issueName = issueName;
        this.issueDate = issueDate;
        this.issueLocation = issueLocation;
        this.resolved = resolved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueLocation() {
        return issueLocation;
    }
    
    

    public void setIssueLocation(String issueLocation) {
        this.issueLocation = issueLocation;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
    
    public String displayDetails(){
        
        String status;
        if(resolved == true){
            status = "Inactive";
        }
        else{
            status = "Active";
        
        }
    
        return "Issue ID: "+id+"sName: "+issueName+"\nIssue Date: "+issueDate+"\nLocation: "+issueLocation+"\nStatus: "+status;
    
    }
    
}