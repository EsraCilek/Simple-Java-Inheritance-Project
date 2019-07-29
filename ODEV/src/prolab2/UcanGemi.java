package prolab2;


public  class UcanGemi extends HavaDenizTasitlari {

    public UcanGemi(String marka, int hiz, int tekerlekler, int fiyat, String renk, int uretim_yili, int yolcu_sayisi, String yakit_turu) {
        super(marka, hiz, tekerlekler, fiyat, renk, uretim_yili, yolcu_sayisi, yakit_turu);
    }

    public UcanGemi() {
    }
    
    


    
    String YazUcanGemi(String marka, int hiz, int tekerlekler, int fiyat, String renk, int uretim_yili, int yolcu_sayisi, String yakit_turu) {
        return "Marka:"+ marka+ "|"+"Hız:" + hiz + "|"+"Tekerlekler:" +tekerlekler + "|"+"Fiyat:"+fiyat +
                "|"+"Renk:" + renk + "|"+"Üretim Yılı:" + uretim_yili + "|"+"Yolcu Sayısı:" + yolcu_sayisi + "|"+"Yakıt Türü:" + yakit_turu + "-"; 
        
    }

    
} 
       
  
    

