package databasefootball;

import javax.swing.JOptionPane;

public class Member {
// creating all private variables
    private Integer studentID;
    private String playerName;
    private String playerPosition;
    private Integer playerNumber;

    public Member() { // constructing the member class and set all variable to null
        studentID = null;
        playerName = null;
        playerPosition = null;
        playerNumber = null;

    }

    public Member(int id, String pName, String Position, int Num) { // constructor with a parameter
        studentID = id;
        playerName = pName;
        playerPosition = Position;
        playerNumber = Num;

    }

    public void setName(String pName) { // this method sets player's name
        playerName = pName;
    }

    public void setPosition(String pos) { // this method sets player's position
        playerPosition = pos;
    }

    public void setId(int id) { // this methods sets player's id
        studentID = id;
    }

    public void setNumber(int pnum) { // this method sets player's jersy number
        playerNumber = pnum;
    }

    public String getName() { // this method returns player's name
        return playerName;
    }

    public String getPosition() { // this method returns player position
        return playerPosition;
    }

    public int getId() { // this method returns player's id
        return studentID;
    }

    public int getNumber() { // this method returns player jersy number
        return playerNumber;
    }

    @Override
    public String toString() { // to string formats the output
            
        return ("Student ID:  " + getId() + "\n"
                + " Name:  " + getName() + "\n"
                + " Position:  " + getPosition() + "\n"
                + " Player's Number:  " + getNumber() + "\n \n");

    }

}
