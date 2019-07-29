package prolab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Otomobil extends KaraTasitlari{
    
    private String yakit_turu;

    public  Otomobil(String marka, int hiz, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat,String yakit_türü) {
        
        super(marka, hiz, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat);
          this.yakit_turu=yakit_turu;         
    }

    @Override
    public String YazOto(String marka, int hız, int yolcu_sayisi,String yakit_turu, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        return super.YazOto(marka, hız, yolcu_sayisi,yakit_turu, tekerlekler, üretim_yili, renk, fiyat); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
   Otomobil() {
        
    }
    
    

        
    
}