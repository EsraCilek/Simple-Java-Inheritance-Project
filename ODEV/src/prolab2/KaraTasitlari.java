package prolab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public  class KaraTasitlari extends Arac {
    private int tekerlekler;

    public KaraTasitlari(String marka, int hiz, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        super(marka, hiz, yolcu_sayisi, üretim_yili, renk, fiyat);
        this.tekerlekler=tekerlekler;
    }

    public KaraTasitlari() {
    }
    
   
    
    
    public String YazOto(String marka, int hız, int yolcu_sayisi,String yakit_turu, int tekerlekler, int üretim_yili, String renk, int fiyat){
        
        return "Marka:" +marka+ "|" + "Hız:" + hız + "|"+ "Yolcu Sayısı:" +yolcu_sayisi + "|"+"Yakıt Türü:" +yakit_turu + "|"
                +"Tekerlek Sayısı:"+ tekerlekler + "|"+"Üretim Yılı:" + üretim_yili + "|"+"Renk:" + renk + "|"+"Fiyat:" + fiyat +"-";
    }
    
    public String YazBike(String marka, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat){
        return "Marka:"+ marka+ "|"+"Hız:" + hız + "|"+"Yolcu Sayısı:" +yolcu_sayisi + "|"+"Tekerlek Sayısı" + tekerlekler + "|"
                +"Üretim Yılı:" + üretim_yili + "|"+"Renk:" + renk + "|"+"Fiyat:" + fiyat+ "-";
    }
    



   
}
