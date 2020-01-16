package databasefootball;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseFootball {

    public static void main(String[] args) {

        Database bs = new Database(); // instantiaiting new Database Object

        JOptionPane.showMessageDialog(null, "welcome to football database program! " // programs's description
                + "\n in this program you'll be adding, searching and \n deleting users in the database");
        do { // do while loop
            Member mem = new Member(); // creating a new player object all the time
            String Input = " "; // variable that holds user's input
            Input = JOptionPane.showInputDialog("Enter INSERT to add player, \n " // prompt to enter input
                    + "DELETE to remove player and \n SEARCH to look up player");
           
            if (Input.equalsIgnoreCase("INSERT")) { // checks if input is insert
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Id")); // gets id number to save
                mem.setId(id); // sets the id to member object
                String Name = JOptionPane.showInputDialog("enter Name"); //gets player's name to add
                mem.setName(Name); // sets the player's name
                String Position = JOptionPane.showInputDialog("Enter Player's Position"); // gets player's position
                mem.setPosition(Position); // sets player's position
                int playnum = Integer.parseInt(JOptionPane.showInputDialog("Enter Player's Number")); //gets player's number
                mem.setNumber(playnum); // sets player's number
                bs.addInfo(mem); // adds the member object to the database or arraylist object

                JOptionPane.showMessageDialog(null, (bs.toString())); // displays the information added
            } else if (Input.equalsIgnoreCase("DELETE")) { // checks if user requested to delete
                try{
                int del = Integer.parseInt(JOptionPane.showInputDialog("Enter ID number to be deleted"));// request id to be deleted
                 bs.DeleteInfo(del);  // deletes the information using the deletInfo() method in database
                 JOptionPane.showMessageDialog(null, (bs.toString())); // displays current data
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"ID not found try Again!");
                  }
                
                
            } else if (Input.equalsIgnoreCase("SEARCH")) { // if user wants to search for a specific id
                int srch = Integer.parseInt(JOptionPane.showInputDialog("Enter ID number you'd like to search")); // holds the id number
                bs.Search(srch); // searches for the id requested using the search method in database
            }
            else{
                JOptionPane.showMessageDialog(null,"YOU ENTERED AN INVALID KEYWORD!!"); // 
            }

        } while (JOptionPane.showConfirmDialog(null, "would you like to continue") == 0); // continues entry if user says yes
    //    JOptionPane.showMessageDialog(null, (bs.toString()));

    }

}
