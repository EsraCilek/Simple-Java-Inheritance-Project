package prolab2;

public abstract class HavaDenizTasitlari {
    
    private String marka;
     private int hiz;
    private int tekerlekler;
    private int fiyat;
    private String renk;
    private int uretim_yili;
    private int yolcu_sayisi;
    private String yakit_turu;
    

    public HavaDenizTasitlari(String marka, int hiz, int tekerlekler, int fiyat, String renk, int uretim_yili, int yolcu_sayisi, String yakit_turu) {
        this.marka = marka;
        this.hiz = hiz;
        this.tekerlekler = tekerlekler;
        this.fiyat = fiyat;
        this.renk = renk;
        this.uretim_yili = uretim_yili;
        this.yolcu_sayisi = yolcu_sayisi;
        this.yakit_turu = yakit_turu;
    }

    public HavaDenizTasitlari() {
    }
    
    abstract String YazUcanGemi(String marka, int hiz, int tekerlekler, int fiyat, String renk, int uretim_yili, int yolcu_sayisi, String yakit_turu);

    
    public String getMarka() {
        return marka;
    }

   
    public void setMarka(String marka) {
        this.marka = marka;
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

  
    public int getFiyat() {
        return fiyat;
    }

  
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

  
    public String getRenk() {
        return renk;
    }


    public void setRenk(String renk) {
        this.renk = renk;
    }

 
    public int getUretim_yili() {
        return uretim_yili;
    }

 
    public void setUretim_yili(int uretim_yili) {
        this.uretim_yili = uretim_yili;
    }

   
    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

  
    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
    }

  
    public String getYakit_turu() {
        return yakit_turu;
    }

  
    public void setYakit_turu(String yakit_turu) {
        this.yakit_turu = yakit_turu;
    }
    
    
    
    
}
