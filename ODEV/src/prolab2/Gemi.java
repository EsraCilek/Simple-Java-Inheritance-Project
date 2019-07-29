package prolab2;

import java.util.Scanner;


public class  Gemi extends DenizTasitlari{
    String yakit_turu;

    public Gemi(String marka,String yakit_turu, int hiz, int yolcu_sayisi, int üretim_yili, String renk, int fiyat) {
        super(marka,  hiz, yolcu_sayisi, üretim_yili, renk, fiyat);
        this.yakit_turu=yakit_turu;
    }

    public Gemi() {
    }

 
    
   

    @Override
    public String YazGemi(String marka, int hız, int yolcu_sayisi, String yakit_turu, int üretim_yili, String renk, int fiyat) {
        return super.YazGemi(marka, hız, yolcu_sayisi, yakit_turu, üretim_yili, renk, fiyat); //To change body of generated methods, choose Tools | Templates.
    }

  

      
    
}


