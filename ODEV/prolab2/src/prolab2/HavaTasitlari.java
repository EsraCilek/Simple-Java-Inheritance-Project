
package prolab2;


public class HavaTasitlari {
    
    private String marka;
    private int üretim_yili;
    private int fiyat;
    private int yolcu_sayisi;
    private String renk;
    private int hiz;
    private int tekerlekler;

    public HavaTasitlari(String marka, int üretim_yili, int fiyat, int yolcu_sayisi, String renk, int hiz, int tekerlekler) {
        this.marka = marka;
        this.üretim_yili = üretim_yili;
        this.fiyat = fiyat;
        this.yolcu_sayisi = yolcu_sayisi;
        this.renk = renk;
        this.hiz = hiz;
        this.tekerlekler = tekerlekler;
    }
    public HavaTasitlari(){
        
    }
    
    public void bilgilerigoster(){
        
        System.out.println("ucagın markası "+getMarka());
    }

  
    public String getMarka() {
        return marka;
    }

   
    public void setMarka(String marka) {
        this.marka = marka;
    }

 
    public int getÜretim_yili() {
        return üretim_yili;
    }

  
    public void setÜretim_yili(int üretim_yili) {
        this.üretim_yili = üretim_yili;
    }

 
    public int getFiyat() {
        return fiyat;
    }

 
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

 
    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

   
    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
    }

   
    public String getRenk() {
        return renk;
    }

 
    public void setRenk(String renk) {
        this.renk = renk;
    }

  
    public int getHiz() {
        return hiz;
    }

 
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }


    public int getTekerlekler() {
        return tekerlekler;
    }

    
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }
    
    
    
 
    
}
