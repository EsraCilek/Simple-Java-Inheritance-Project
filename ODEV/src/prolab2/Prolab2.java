package prolab2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Prolab2 {

    
    public static void main(String[] args) {
        String  marka1;
        String secim;
        
        Scanner keyboard= new Scanner(System.in);
        
        FileWriter writer=null;
       
        
        try {
            writer= new FileWriter("deneme.txt",true);
       
           
            
            
        } catch (IOException ex) {
            System.out.println("dosya açılırken IO hatası oluştu");
        }
        finally{
            if(writer !=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("dosya kapatılırken hata oluştu");
                }
            }
            
            
        
    }
    }
}
     