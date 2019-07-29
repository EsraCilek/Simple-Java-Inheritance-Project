package prolab2;


public class Arac {
    private String marka;
    private int hiz;
    private int yolcu_sayisi;
    private int üretim_yili;
    private String renk;
    private int fiyat;

    public Arac(String marka, int hiz, int yolcu_sayisi, int üretim_yili, String renk, int fiyat) {
        this.marka = marka;
        this.hiz = hiz;
        this.yolcu_sayisi = yolcu_sayisi;
        this.üretim_yili = üretim_yili;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public Arac() {
    }

    
    public String getMarka() {
        return marka;
    }

   
    public void setMarka(String marka) {
        this.marka = marka;
    }

   
    public int getHız() {
        return hiz;
    }

 
    public void setHız(int hız) {
        this.hiz = hiz;
    }

    
  
    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

  
    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
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
    }
    
    
}