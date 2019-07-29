package prolab2;


public class HavaTasitlari extends Arac {

    private int tekerlekler;
    public HavaTasitlari(String marka, int hiz, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        super(marka, hiz, yolcu_sayisi, üretim_yili, renk, fiyat);
        this.tekerlekler=tekerlekler;
    }

    public HavaTasitlari() {
    }
    
    
    
   
    
    public String YazUcak(String marka,String yakit_turu, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat){
        
        return "Marka:"+ marka+ "|"+"Hız:" + hız + "|"+"Yolcu Sayısı:" +yolcu_sayisi + "|"+"Yakıt Türü:"+yakit_turu +
                "|"+"Tekerlek Sayısı:" + tekerlekler + "|"+"Üretim Yılı:" + üretim_yili + "|"+"Renk:" + renk + "|"+"Fiyat:" + fiyat + "-";
    }
    
   
}