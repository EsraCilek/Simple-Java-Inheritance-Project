package prolab2;


public class Bisiklet extends KaraTasitlari{

    public Bisiklet(String marka, int hız, int yolcu_sayisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        super(marka, hız, yolcu_sayisi, tekerlekler, üretim_yili, renk, fiyat);
    }

    public Bisiklet() {
    }

    @Override
    public String YazBike(String marka, int hız, int yolcu_saiyisi, int tekerlekler, int üretim_yili, String renk, int fiyat) {
        return super.YazBike(marka, hız, yolcu_saiyisi, tekerlekler, üretim_yili, renk, fiyat); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}