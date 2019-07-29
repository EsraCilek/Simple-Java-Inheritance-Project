
package prolab2;

import java.util.Scanner;


public class Ucak extends HavaTasitlari{
    private int sayi;
    
    
    public Ucak(String marka, int üretim_yili, int fiyat, int yolcu_sayisi, String renk, int hiz, int tekerlekler) {
        
        super(marka, üretim_yili, fiyat, yolcu_sayisi, renk, hiz, tekerlekler);
    }
    Ucak() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void bilgilerigoster(){
        Scanner keyboard =new Scanner(System.in);
        System.out.println("ucagın markası "+getMarka());
        System.out.println("ucak sayısını giriniz: ");
        int sayi=keyboard.nextInt();
        this.sayi=sayi;
        System.out.println(+sayi+ " adet ucak bulunmaktadır");
        
    }
}
