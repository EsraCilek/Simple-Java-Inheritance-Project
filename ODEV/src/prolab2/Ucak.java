package prolab2;

import java.util.Scanner;


public class Ucak extends HavaTasitlari{
    private String yakit_turu;

    public Ucak(String marka,String yakit_turu, int hiz, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        super(marka, hiz, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat);
        this.yakit_turu=yakit_turu;
    }

    

    public Ucak() {
    }

    @Override
    public String YazUcak(String marka, String yakit_turu, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        return super.YazUcak(marka, yakit_turu, hız, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat); //To change body of generated methods, choose Tools | Templates.
    }

   
 
   
}