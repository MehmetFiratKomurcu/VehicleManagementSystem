/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagementsystem;

/**
 *
 * @author Ali Recep KARACA and Mehmet Firat KOMURCU
 */
public class Bisiklet extends KaraTasitlari{
    
    public static int counter = 0;
    private String ID;
    public Bisiklet() {
        super("Bianchi","Mavi",2,2,2018,700,0,false);
        counter++;
        setID(counter);
    }
    public Bisiklet(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili,double fiyat, double hiz){
        super(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz,false);
        counter++;
        setID(counter);
    }

    public String getID() {
        return ID;
    }

    public void setID(int counter) {
        ID=this.getClass().getSimpleName()+ "" + counter;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int count){
        counter=count;
    }
    
}
