/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1.sba23240;

/**
 *
 * @author Mark
 */
public class CA1Sba23240 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< Updated upstream
        // TODO code application logic here
    }
    
=======
        String studentsFile = "students.txt";
        String statusFile = "status.txt";
        
    try{
        BufferedReader br = new BufferedReader (new FileReader(studentsFile));
        FileWriter wr = new FileWriter (statusFile);
        
        String line;
        while ((line = br.readLine()) != null) {
        
        String[] nameParts = line.split(" "); // inorder not to include spaces into count
        
        }
        } catch (Exception e) {
            System.out.println("Invalid data in the file. Please double-check data in the file!");
        }
    }
    
    
>>>>>>> Stashed changes
}
