//subclass
package prolab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Otomobil extends KaraTasitlari{
    
    private String yakit_türü;

    public  Otomobil(String marka, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat,String yakit_türü) {
        
        super(marka, hız, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat);
          this.yakit_türü=yakit_türü;         
    }

    @Override
    public String Yaz(String marka, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        return super.Yaz(marka, hız, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat); 
    }
    
  //  FileWriter writer=null;
    
   /* public void DosyaAc(){
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
     }*/
    

    
   

    
    
    
    Otomobil() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    public void bilgilerigoster(){
        
        System.out.println("yakıt: " +this.yakit_türü);
    }

    //@Override
   /* public int[] otomobilId(int sayi) {
        return super.otomobilId(sayi); //To change body of generated methods, choose Tools | Templates.
    }*/
    

    
        
        
    
}
    

   
   
    
   /* private String marka;
    private int hız;
    private int yolcu_sayisi;
    private int tekerlekler;
    private int üretim_yili;
    private String renk;
    private int fiyat;
    
    public Otomobil(){
        
       // System.out.println("Kendi yadığımız const");
      
    }

    public Otomobil(String marka, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        this.marka = marka;
        this.hız = hız;
        this.yolcu_sayisi = yolcu_sayisi;
        this.tekerlekler = tekerlekler;
        this.üretim_yili = üretim_yili;
        this.renk = renk;
        this.fiyat = fiyat;
    }
    
    
    
    public void setMarka(String marka){
        
        this.marka = marka;
        
    }
    
    public String getMarka(){
        
        return marka;
    
    }


    public int getHız() {
        return hız;
    }

   
    public void setHız(int hız) {
        this.hız = hız;
    }


    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

    
    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
    }

   
    public int getTekerlekler() {
        return tekerlekler;
    }

 
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

   
    public int getÜretim_yili() {
        return üretim_yili;
    }


    public void setÜretim_yili(int üretim_yili) {
        this.üretim_yili = üretim_yili;
    }

 
    public String getRenk() {
        return renk;
    }


    public void setRenk(String renk) {
        this.renk = renk;
    }


    public int getFiyat() {
        return fiyat;
    }

 
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }*/
    
    

