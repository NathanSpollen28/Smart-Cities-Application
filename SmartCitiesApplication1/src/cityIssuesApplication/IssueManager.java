/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cityIssuesApplication;
import java.util.ArrayList;

/**
 *
 * @author Nathan Spollen
 */
public class IssueManager {
    private ArrayList<Issue> issueHolder = new ArrayList<>();
    private int idCounter = 1;
    public void addIssue(Issue newIssue) {
       issueHolder.add(newIssue);
    }
    public void deleteIssue(int id) {
        for (Issue i : issueHolder) {
            if (i.getId() == id) {
                issueHolder.remove(i);
                break;
            }
        }
    }
    

    public ArrayList<Issue> getIssueHolder() {
        return issueHolder;
    }
    

    public int getIdCounter() {
        return idCounter;
    }
    
    public String displayAllIssues() {
    String result = "";

    for (Issue i : issueHolder) {
        result = result + i.displayDetails() + "\n\n";
        
    }
    

    
   

    return result;
}
      public int getNextId() {
    int current = idCounter;  
    idCounter = idCounter + 1;
    return current;          
}

    
       
    
}
    


