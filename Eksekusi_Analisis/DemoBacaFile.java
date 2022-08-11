package Eksekusi_Analisis;

import java.io.*;

public class DemoBacaFile {
    public static void main(String[] args){
        FileInputStream finput=null;
        int data;
        try{
            finput=new FileInputStream("D:/file.txt");
        }
        catch(FileNotFoundException fnfe){
            System.out.println("File tidak ditemukan");
            return;
        }
        try{
            while((data=finput.read())!=-1){
                System.out.println((char)data);
            }
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return;
        }
        try{
            finput.close();
        }
        catch(IOException ioe){}
    }
}
    

