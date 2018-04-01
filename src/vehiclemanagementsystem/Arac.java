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
public interface Arac {
    public String getMarka();
    public void setMarka(String marka);
    public double getHiz();
    
    public void setHiz(double hiz);
    
    public String getRenk();
    

    public void setRenk(String renk);

    public int getYolcuSayisi();

    public void setYolcuSayisi(int yolcuSayisi);

    public int getTekerlekSayisi();

    public void setTekerlekSayisi(int tekerlekSayisi);

    public int getUretimYili();
    

    public void setUretimYili(int uretimYili);

    public double getFiyat();
    

    public void setFiyat(double fiyat);
    
    abstract void hizlan(double hiz);
    abstract void yavasla(double hiz);
    abstract void dur();
    abstract int getCounter();
    abstract void setCounter(int count);
}
