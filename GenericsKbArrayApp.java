/*
slxmoe012
program to read, edit and find items in knowledge base
21 feb '24
*/
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class GenericsKbArrayApp {

   String[] kb;  // = new String[];
   String file; 
   public GenericsKbArrayApp(String file_name){  // constructor that sets file name 
      file = file_name;
   }  
   
   public int numLines(String file_name) { // method to count number of lines in given file - will be used to determine size of array
      int count = 0; 
      try {
         File base = new File(file_name);      // create file object
         Scanner scanner = new Scanner(base);
         while (scanner.hasNextLine()) {       // checks if file has next line
            scanner.nextLine(); 
            count++;                            // increments count
         }
      scanner.close();
      }
      catch (Exception e){ 
         System.out.println("Error! File not found");  // if file not found - print error
         
      }
      
      return count;
   }
   
   public String[] setKB(String file_name) {
   
      kb = new String[numLines(file_name)];          // initialises array - size of array = number of lines of file
      
      try {
         Scanner scanner = new Scanner(new File(file_name));       // new scanner object to read in file
         //while (scanner.hasNextLine()) {                           // while file has another line
            int lines = numLines(file_name);
            for (int i = 0 ; i < lines; i++) {      
               kb[i] = scanner.nextLine();                         // adds line to array 
            }
            scanner.close();
         }
      
      catch (Exception e){ 
         System.out.println("Error! File not found");             // if file not found - prints error
      }
      //scanner.close();
      return kb;                                                  // returns array
   }
   public String searchTerm(String term) {
   
      String[] searchTerm = new String[3];
      int lines = numLines(file);
            for (int i = 0 ; i < lines; i++) {
         searchTerm = kb[i].split("\t");
         if (searchTerm[0].compareTo(term)==0) {
            return "Statement found: " + searchTerm[1] + " (Confidence score: " + searchTerm[2] + ")";
         }
      }
      return "Term not found in knowledge base";
   }
   
   public String searchConfidenceLvl(String term, String sentence) {
      
      String[] searchTerm = new String[3];
      int lines = numLines(file);
      for (int i = 0 ; i < lines; i++) {
         searchTerm = kb[i].split("\t");
         if ((searchTerm[0].compareTo(term)==0) && (searchTerm[1].compareTo(sentence)==0)) {
            return "The statement was found and has a confidence score of " + searchTerm[2] +".";
         }
      }
      return "Term and sentence not found in knowledge base";

   }
   
   public String updateTerm(String term, String sentence, String confidenceLvl) {
   
      String[] searchTerm = new String[3];
      int lines = numLines(file);
      for (int i = 0 ; i < lines; i++) {
         searchTerm = kb[i].split("\t");
         if ((searchTerm[0].compareTo(term)==0)) {
            kb[i] = searchTerm[0] + "\t" + sentence + "\t" + confidenceLvl; 
            return "Statement for term " + term + " has been updated.";
            //return "The statement was found and has a confidence score of " + searchTerm[2] +".";
         }
      }
      return "Term and sentence not found in knowledge base";

   }

}