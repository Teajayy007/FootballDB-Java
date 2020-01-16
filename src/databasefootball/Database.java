package databasefootball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Database  {

    private ArrayList<Member> table; // creating an arrayList of Table

    public Database() { // construction object
        table = new ArrayList<>();

    }

    public void addInfo(Member info) { // method adds or inserts objects to arrayList
        table.add(info);
        
    }

    public void DeleteInfo(int d) { // this method takes and input then searches the table to get id that matches to be deleted
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).getId() == d) {
                table.remove(i);
            }

        }
    }

    public void Search(int s) { // this method takes the input and displays id number reqesuted for
        for (int i = 0; i < table.size(); i++) {
            if (table.get(i).getId() == s) {

                JOptionPane.showMessageDialog(null, "Student ID " + table.get(i).getId() + "\n"
                        + " Name " + table.get(i).getName() + "\n"
                        + " Position " + table.get(i).getPosition() + "\n"
                        + " Player's Number " + table.get(i).getNumber());
            }
        }
    }

    public String toString() { // to string method that displays data from the arrayList
        String result = " ";
        for (Member tb : table) {
            result += (tb);
        }
        return result;
    }

   
}
