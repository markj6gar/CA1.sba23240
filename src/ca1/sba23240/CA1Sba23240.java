/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1.sba23240;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

/**
 *
 * @author Mark
 */
public class CA1Sba23240 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      
   
        String studentsFile = "students.txt"; // storing file names for easier coding in future
        String statusFile = "status.txt";
        
    try{
        BufferedReader br = new BufferedReader (new FileReader(studentsFile));
        FileWriter wr = new FileWriter (statusFile);
        
        String line;
        while ((line = br.readLine()) != null) {   // raed each line form the student.txt   
        
        String[] nameParts = line.split(" "); // but do not include spaces into the count
        
        
        
        
        
        }
        } catch (Exception e) {
            System.out.println("Error. Invalid data in the file. Please double-check data in the file!");
        }
    }
    //the first name must be letters only; 
    
    private static boolean FirstName(String firstName) {
        return Pattern.matches("[a-zA-Z]+", firstName);
    }
    
     private static boolean LastName(String lastName) {
        return Pattern.matches("[a-zA-Z0-9]+", lastName);
   
     }

}
