package prolab2;


public class DenizTasitlari extends Arac {

    public DenizTasitlari(String marka, int hız, int yolcu_sayisi, int üretim_yili, String renk, int fiyat) {
        super(marka, hız, yolcu_sayisi, üretim_yili, renk, fiyat);
    }

    public DenizTasitlari() {
    }
    
    

  
    
    
    
  
    
    public String YazGemi(String marka, int hız, int yolcu_sayisi,String yakit_turu, int üretim_yili, String renk, int fiyat){
        
        return "Marka:"+ marka+ "|"+"Hız:" + hız + "|"+"Yolcu Sayısı:" +yolcu_sayisi +"Yakı Türü:"+yakit_turu+ "|"+"Üretim Yılı:" + üretim_yili + "|"+"Renk:" + renk + "|"+"Fiyat:" + fiyat +"-";
    }
    
    
}