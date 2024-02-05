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
        
       
        
   
     try (BufferedReader br= new BufferedReader(new FileReader(studentsFile));
             FileWriter wr = new FileWriter(statusFile)) {
        
        String line;
        while ((line = br.readLine()) != null) {   // raed each line form the student.txt   
        
        String[] nameParts; // but do not include spaces into the count
        nameParts = line.split(" ");
        
        //so first we check if all the data is correct
        
        if (!ValidFirstName(nameParts[0]) || !ValidLastName(nameParts[1])) {
            System.out.println("Invalid first or last name. Please only include first names with only letters and last name can have both." + line);
            continue;
        }
        
        String numClassesString = br.readLine();
        int numClasses;
        try {
            numClasses = Integer.parseInt(numClassesString); // converting into integer
        } catch (NumberFormatException e) {
            System.out.println("Invalid number of classes, should be in between 1 and 8. " + numClassesString);
            continue;
        }
        
        if (numClasses < 1  || numClasses > 8) {
            System.out.println("Number of classes, should be in between 1 and 8." + numClassesString);
            continue;
        }
        
        String studentNumber = br.readLine();
        if (!ValidStudentNumber(studentNumber)) {
            System.out.println("Invalid student number: " + studentNumber);
        }
        //turning number of classes into workload
        String workload = calculateWorkload(numClasses);

        
        wr.write(studentNumber + " - " + nameParts[1] + "\n");
        wr.write(workload + "\n\n");
           }
     
        } catch (Exception e) {
          System.out.println("Error. Invalid data in the file. Please double-check data in the file!" + e.getMessage());
        }
    }
    //the first name must be letters only; 
    
    private static boolean ValidFirstName(String name) {
        return Pattern.matches("[a-zA-Z]+", name);
    }
    //the second name can be letters and/or numbers and must be separated from the first name by a single space; 
    
     private static boolean ValidLastName(String name) {
        return Pattern.matches("[a-zA-Z0-9]+", name);
   
     }
      private static boolean ValidStudentNumber(String studentNumber) {
        return Pattern.matches((" \\d{2}[A-Z]{3, 5}\\d+"), studentNumber);
   
     }
    private static String calculateWorkload(int numClasses) {
       if(numClasses == 1) {
           return "Very Light";
       } else if (numClasses ==2)   {   
           return "Light";
    } else if (numClasses >= 3 && numClasses <= 5) {
        return "Part Time";
    } else {
        return "Full Time";
         }
  
   
    }
    
}

