
package prolab2;

import java.util.Scanner;


public class  Gemi extends DenizTasitlari{
    String renk;
    

    public Gemi(String marka, int hız, int üretim_yili, int yolcu_sayisi, int fiyat, String renk, String yakit_türü) {
        
        super(marka, hız, üretim_yili, yolcu_sayisi, fiyat, renk, yakit_türü);
    }

    Gemi() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void bilgiler(){
       
        Scanner keyboard =new Scanner(System.in);
        
        System.out.println("geminin rengini giriniz: ");
        String renk=keyboard.nextLine();
        System.out.println("Gemi " + renk +  " renklidir");
          
        
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster(); 
    }
    
    
    

   
      
    
}
