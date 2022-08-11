package Eksekusi_Analisis;

import java.io.*;

public class DemoTulisFile{ 
  public static void main(String[] args){

   FileOutputStream foutput = null; 
   String data = "Baris pertama \nBaris kedua \nBaris ketiga";

   try{ 
     foutput = new FileOutputStream("d:/output.txt");
   }
   catch (FileNotFoundException fnfe){ 
     System.out.println("File tidak dapat terbentuk."); 
     return;
   }
   try{
      for (int i=0; i<data.length(); i++) { 
        foutput.write((int)data.charAt(i));
      }
    }
   catch (IOException ioe) { 
    System.out.println(ioe.getMessage());
    return;
   } 
   try{
    foutput.close();
   } 
   catch (IOException ioe) {}
   }
 }
