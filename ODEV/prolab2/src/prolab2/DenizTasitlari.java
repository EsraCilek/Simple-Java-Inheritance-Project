
package prolab2;


public class DenizTasitlari {
    
    private String marka;
    private int hız;
    private int üretim_yili;
    private int yolcu_sayisi;
    private int fiyat;
    private String renk;
    private String yakit_türü;

    public DenizTasitlari(String marka, int hız, int üretim_yili, int yolcu_sayisi, int fiyat, String renk, String yakit_türü) {
        this.marka = marka;
        this.hız = hız;
        this.üretim_yili = üretim_yili;
        this.yolcu_sayisi = yolcu_sayisi;
        this.fiyat = fiyat;
        this.renk = renk;
        this.yakit_türü = yakit_türü;
    }
    public DenizTasitlari(){
        
    }
    
    public void bilgiGoster(){
        
        System.out.println(getYakit_türü());
        System.out.println("renk: "+renk);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getHız() {
        return hız;
    }

    public void setHız(int hız) {
        this.hız = hız;
    }

    public int getÜretim_yili() {
        return üretim_yili;
    }

    public void setÜretim_yili(int üretim_yili) {
        this.üretim_yili = üretim_yili;
    }

    public int getYolcu_sayisi() {
        return yolcu_sayisi;
    }

    public void setYolcu_sayisi(int yolcu_sayisi) {
        this.yolcu_sayisi = yolcu_sayisi;
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

    public String getYakit_türü() {
        return yakit_türü;
    }

    public void setYakit_türü(String yakit_türü) {
        this.yakit_türü = yakit_türü;
    }
            
            
    
    
}
