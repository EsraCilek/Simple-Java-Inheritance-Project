
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
       /* int counter=0;
        int counter1=0;
        
        Otomobil[] otomobil2= {new Otomobil(args, 0, 0, 0, 0, "mor", 0, "dizel")
        ,new Otomobil(args, 0, 0, 0, 0, "sarı", 0, "benzin"),new Otomobil(args, 0, 0, 0, 0, "adsd", 0, "sadasf")};
        
        Gemi[] gemi2={new Gemi("opel", 0, 0, 0, 0, "siyah", "benzin")
        ,new Gemi("asd", 0, 0, 0, 0, "asdd", "ddddd")};
        
      for(int i=0;i<otomobil2.length;i++){
          System.out.println(otomobil2[i]);
       }
        
        for (Otomobil a: otomobil2){
           
            System.out.println(a);
            counter++;
            
        }
        System.out.println("otomobil sayısı: "+counter);
        for (Gemi b : gemi2){
            System.out.println(b);
            counter1++;
        }
        System.out.println("gemi sayısıı: "+counter1);
        
        HavaTasitlari ucak2 =new Ucak("dodo111", counter1, counter, counter1, "al", counter, counter);
        ucak2.bilgilerigoster();*/
        
        
        
        
        
        
    
    
    
    
    
    
        
       /* //Otomobil[] otomobil2= new Otomobil("", 0, 0, 0, 0, "siyah", 0,"benzin");//polimorphism
        
        otomobil2.bilgilerigoster();
        System.out.println("geminin bilgileri");
        DenizTasitlari gemi2= new Gemi("esra", 0, 0, 0, 0,"mor", "dizel");//polimorphism
        gemi2.bilgiGoster();
        gemi2.bilgiler();
        Ucak ucak2=new Ucak("esra1", 0, 0, 0, "kahve", 0, 0);
        ucak2.bilgilerigoster();*/
       
        
    }
    

