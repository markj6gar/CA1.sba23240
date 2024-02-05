/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca1.sba23240;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Mark
 */
public class CA1Sba23240 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try{
    BufferedReader br = new BufferedReader (new FileReader("student.txt"));
    String data = br.readLine();
  
    String first3 = data.substring(0,3);
    String second3 = data.substring(3,6);
    if (first3.equalsIgnoreCase(second3)) {
        System.out.println("Error: Currencies match!");
    } else {
        if (!first3.matches("[a-zA-Z]+")) {
            System.out.println("The origin currency must be letters");
        } else {
            if (!second3.matches("[a-zA-Z]+")){
                System.out.println("The destination currency must be letters");
            } else {
                String numbers = data.substring(6);
                // 12-70
                int dashIndex = numbers.indexOf ("-");
                if (dashIndex == -1) {
                    System.out.println("Error: There must be a '-' in the trade");
                } else {
                    String firstNums = numbers.substring(0, dashIndex);
                    if (!firstNums.matches("\\d+")) {
                        System.out.println("The trade price must be a number.");
                    } else {
                        int lastNum = numbers.length()-1;
                        String secondNums = numbers.substring(dashIndex+1, lastNum);
                        if (!secondNums.matches("[0-9]+")) {
                            System.out.println("The trade amount must be a number.");
                        } else {    
                            String lastLetter = numbers.substring(numbers.length()-1);
                            if (!lastLetter.matches("[OR]")) {
                                System.out.println("The trade must end with an O or an R.");
                            } else {
                            BufferedWriter bw = new BufferedWriter(new FileWriter("status.csv"));
                            bw.write(first3+","+second3+","+firstNums+","+secondNums+","+lastLetter);
                            bw.close();
                            }
                        }
                    }
                }              
            }
        }
        String numbers = data.substring(6);
          }
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
