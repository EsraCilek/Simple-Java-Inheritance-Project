
package prolab2;

import java.awt.Event;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doguk
 */
public class Form2 extends javax.swing.JFrame {
    
    FileWriter writer=null;
   

     String marka;
     int uretim_yili;
     int fiyat;
    int yolcu_sayisi;
     String renk;
     int hiz;
     int tekerlekler;
     String yakit_turu;
     String a;
     String b;
     String c;
     String d;
     String e;
     String flag="0";
     
     
     
     
     
     

 
    
    public Form2() {
        initComponents();
        
  

    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Marka = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        YakıtTuru = new javax.swing.JTextField();
        Renk = new javax.swing.JTextField();
        Fiyat = new javax.swing.JTextField();
        YolcuSayisi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UretimYili = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Hiz = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TekerlekSayisi = new javax.swing.JTextField();
        Otoekle = new javax.swing.JButton();
        BisEkle = new javax.swing.JButton();
        GemiEkle = new javax.swing.JButton();
        UcakEkle = new javax.swing.JButton();
        UcanGemiEkle = new javax.swing.JButton();
        Donus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Veri Girişinde Bulunacağınız Aracı Seçiniz");

        jLabel2.setText("Marka");

        jLabel3.setText("Üretim Yılı");

        YakıtTuru.setToolTipText("");

        Renk.setToolTipText("");

        Fiyat.setToolTipText("");

        YolcuSayisi.setToolTipText("");

        jLabel4.setText("Yakıt Türü");

        jLabel5.setText("Fiyat");

        jLabel6.setText("Yolcu Sayısı");

        jLabel7.setText("Renk");

        jLabel8.setText("Hız");

        jLabel9.setText("Tekerlek Sayısı");

        Otoekle.setText("Otomobil");
        Otoekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtoekleActionPerformed(evt);
            }
        });

        BisEkle.setText("Bisiklet");
        BisEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BisEkleActionPerformed(evt);
            }
        });

        GemiEkle.setText("Gemi");
        GemiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GemiEkleActionPerformed(evt);
            }
        });

        UcakEkle.setText("Uçak");
        UcakEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UcakEkleActionPerformed(evt);
            }
        });

        UcanGemiEkle.setText("Uçan Gemi");
        UcanGemiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UcanGemiEkleActionPerformed(evt);
            }
        });

        Donus.setText("Bir Önceki Menüye Dön");
        Donus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonusActionPerformed(evt);
            }
        });

        jButton1.setText("kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Donus)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marka, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(UretimYili, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(YolcuSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Renk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel8)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Hiz, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(YakıtTuru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TekerlekSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Otoekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BisEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GemiEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UcakEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UcanGemiEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YolcuSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UretimYili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YakıtTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TekerlekSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Otoekle)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BisEkle)
                .addGap(18, 18, 18)
                .addComponent(GemiEkle)
                .addGap(18, 18, 18)
                .addComponent(UcakEkle)
                .addGap(18, 18, 18)
                .addComponent(UcanGemiEkle)
                .addGap(18, 18, 18)
                .addComponent(Donus)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonusActionPerformed
       NewJFrame Form1 = new NewJFrame();
       Form1.setVisible(true);
        dispose();
    }//GEN-LAST:event_DonusActionPerformed

    private void OtoekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtoekleActionPerformed

        
           // Otomobil otomobil1= new Otomobil(marka, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat, yakit_turu)
            marka = String.valueOf(Marka.getText());
            uretim_yili = (Integer.parseInt(String.valueOf(UretimYili.getText())));
            fiyat = (Integer.parseInt(String.valueOf(Fiyat.getText())));
            yolcu_sayisi = (Integer.parseInt(String.valueOf(YolcuSayisi.getText())));
            renk = String.valueOf(Renk.getText());
            hiz = (Integer.parseInt(String.valueOf(Hiz.getText())));
            tekerlekler = (Integer.parseInt(String.valueOf(TekerlekSayisi.getText())));
            yakit_turu = String.valueOf(YakıtTuru.getText());
            flag="1";
            
            //KaraTasitlari otomobil1 = new Otomobil(marka, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat, yakit_turu);
           // a = marka+ "|" + hiz + "|" +yolcu_sayisi + "|" + tekerlekler + "|" + uretim_yili + "|" + renk + "|" + fiyat ;
            
            
        
    
             
         
    }//GEN-LAST:event_OtoekleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // FileWriter writer=null;
       
        
        try {
            writer= new FileWriter("arackayitlari.txt",true);
            
            
       if( flag.equals("1")){
           //KaraTasitlari otomobil1 ;
           Otomobil otomobil1=new Otomobil(marka, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat, yakit_turu);
           writer.write("Otomobil Id: "+otomobil1+ "|");
          writer.write(otomobil1.YazOto(marka, hiz, yolcu_sayisi,yakit_turu, tekerlekler, uretim_yili, renk, fiyat));
           writer.write("\n");
          // writer.write("\n");
           
           
           
       } 
       else if(flag.equals("2"))
       {
          Gemi gemi2= new Gemi(marka,yakit_turu,hiz,yolcu_sayisi,uretim_yili,renk,fiyat);
           writer.write("Gemi Id: "+gemi2+"|");
         writer.write(gemi2.YazGemi(marka, hiz, yolcu_sayisi,yakit_turu, uretim_yili, renk, fiyat));
           writer.write("\n");
         // writer.write("\n");
          
       }
       else if (flag.equals("3")){
           
           Bisiklet bisiklet2=new Bisiklet(marka, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat);
           writer.write("Bisiklet Id: "+bisiklet2+"|");
            writer.write(bisiklet2.YazBike(marka, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat));
           writer.write("\n");
           //writer.write("\n");
       }
       else if(flag.equals("4")){
           
           Ucak ucak2=new Ucak(marka,yakit_turu,hiz,yolcu_sayisi,tekerlekler,uretim_yili,renk,fiyat);
           writer.write("Ucak Id: "+ucak2+"|");
           writer.write(ucak2.YazUcak(marka, yakit_turu, hiz, yolcu_sayisi, tekerlekler, uretim_yili, renk, fiyat));
           writer.write("\n");
          // writer.write("\n");
       }
       else if(flag.equals("5")){
           UcanGemi ucangemi2= new UcanGemi(marka,hiz,tekerlekler,fiyat,renk,uretim_yili,yolcu_sayisi,yakit_turu);
           writer.write("UcanGemi Id: "+ucangemi2+"|");
           writer.write(ucangemi2.YazUcanGemi(marka, hiz, tekerlekler, fiyat, renk, uretim_yili, yolcu_sayisi, yakit_turu));
           writer.write("\n");
                  
       }
            
            
        } catch (IOException ex) {
            System.out.println("dosya açılırken IO hatası oluştu");
        }
        finally{
            if(writer !=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("dosya kapatılırken hata oluştu");
                }
            }

    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GemiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GemiEkleActionPerformed
       
           // Gemi gemi2=new Gemi(marka, hiz, uretim_yili, yolcu_sayisi, fiyat, renk, yakit_turu);
               marka = String.valueOf(Marka.getText());
            uretim_yili = (Integer.parseInt(String.valueOf(UretimYili.getText())));
            fiyat = (Integer.parseInt(String.valueOf(Fiyat.getText())));
            yolcu_sayisi = (Integer.parseInt(String.valueOf(YolcuSayisi.getText())));
            renk = String.valueOf(Renk.getText());
            hiz = (Integer.parseInt(String.valueOf(Hiz.getText())));
            //tekerlekler = (Integer.parseInt(String.valueOf(TekerlekSayisi.getText())));
            yakit_turu = String.valueOf(YakıtTuru.getText());
            flag="2";
            
            
    }//GEN-LAST:event_GemiEkleActionPerformed

    private void BisEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BisEkleActionPerformed
            marka = String.valueOf(Marka.getText());
            uretim_yili = (Integer.parseInt(String.valueOf(UretimYili.getText())));
            fiyat = (Integer.parseInt(String.valueOf(Fiyat.getText())));
            yolcu_sayisi = (Integer.parseInt(String.valueOf(YolcuSayisi.getText())));
            renk = String.valueOf(Renk.getText());
            hiz = (Integer.parseInt(String.valueOf(Hiz.getText())));
            tekerlekler = (Integer.parseInt(String.valueOf(TekerlekSayisi.getText())));
            //yakit_turu = String.valueOf(YakıtTuru.getText());
            flag="3";
            
    }//GEN-LAST:event_BisEkleActionPerformed

    private void UcakEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UcakEkleActionPerformed
            marka = String.valueOf(Marka.getText());
            uretim_yili = (Integer.parseInt(String.valueOf(UretimYili.getText())));
            fiyat = (Integer.parseInt(String.valueOf(Fiyat.getText())));
            yolcu_sayisi = (Integer.parseInt(String.valueOf(YolcuSayisi.getText())));
            renk = String.valueOf(Renk.getText());
            hiz = (Integer.parseInt(String.valueOf(Hiz.getText())));
            tekerlekler = (Integer.parseInt(String.valueOf(TekerlekSayisi.getText())));
            yakit_turu = String.valueOf(YakıtTuru.getText());
            flag="4";
            
    }//GEN-LAST:event_UcakEkleActionPerformed

    private void UcanGemiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UcanGemiEkleActionPerformed
            marka = String.valueOf(Marka.getText());
            uretim_yili = (Integer.parseInt(String.valueOf(UretimYili.getText())));
            fiyat = (Integer.parseInt(String.valueOf(Fiyat.getText())));
            yolcu_sayisi = (Integer.parseInt(String.valueOf(YolcuSayisi.getText())));
            renk = String.valueOf(Renk.getText());
            hiz = (Integer.parseInt(String.valueOf(Hiz.getText())));
            tekerlekler = (Integer.parseInt(String.valueOf(TekerlekSayisi.getText())));
            yakit_turu = String.valueOf(YakıtTuru.getText());
            flag="5";

    }//GEN-LAST:event_UcanGemiEkleActionPerformed

    

     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BisEkle;
    private javax.swing.JButton Donus;
    private javax.swing.JTextField Fiyat;
    private javax.swing.JButton GemiEkle;
    private javax.swing.JTextField Hiz;
    private javax.swing.JTextField Marka;
    private javax.swing.JButton Otoekle;
    private javax.swing.JTextField Renk;
    private javax.swing.JTextField TekerlekSayisi;
    private javax.swing.JButton UcakEkle;
    private javax.swing.JButton UcanGemiEkle;
    private javax.swing.JTextField UretimYili;
    private javax.swing.JTextField YakıtTuru;
    private javax.swing.JTextField YolcuSayisi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
