/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagementsystem;

import java.util.Arrays;

/**
 *
 * @author Ali Recep KARACA and Mehmet Firat KOMURCU
 */
public class Otomobil extends KaraTasitlari{
    private String yakitTuru;
    private final String yakitTurleri [];
    public static int counter = 0;
    private String ID;
    
    public Otomobil() {
        super("Mercedes","Gri",5,4,2018,500000,0,true);
        yakitTurleri = new String[]{"Dizel", "Benzin", "LPG", "Elektrik"};
        yakitTuru=yakitTurleri[0];
        counter++;
        setID(counter);
    }
    public Otomobil(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili,double fiyat, double hiz, String yakitTuru){
        super(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz,true);
        yakitTurleri = new String[]{"Dizel", "Benzin", "LPG", "Elektrik"};
        setYakitTuru(yakitTuru);
        counter++;
        setID(counter);
    }
    public String getID() {
        return ID;
    }

    public void setID(int counter) {
        ID=this.getClass().getSimpleName()+ "" + counter;
    }
    @Override
    public String getYakitTuru() {
        return yakitTuru;
    }

    public final void setYakitTuru(String yakitTuru) {
        this.yakitTuru=yakitTuru;
    } 
    public int getCounter(){
        return counter;
    }
    public void setCounter(int count){
        counter=count;
    }
    
}
