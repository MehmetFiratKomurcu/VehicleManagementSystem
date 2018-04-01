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
public abstract class DenizTasitlari implements Arac{
    private String marka,renk;
    private int yolcuSayisi,tekerlekSayisi,uretimYili;
    private double fiyat,hiz;

    public DenizTasitlari(){
        setMarka("Ship");
        setRenk("Beyaz");
        setYolcuSayisi(400);
        setTekerlekSayisi(0);
        setUretimYili(2018);
        setFiyat(1500000);
        setHiz(0);
    }
    public DenizTasitlari(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili,double fiyat, double hiz){
        setMarka(marka);
        setRenk(renk);
        setYolcuSayisi(yolcuSayisi);
        setTekerlekSayisi(tekerlekSayisi);
        setUretimYili(uretimYili);
        setFiyat(fiyat);
        setHiz(hiz);
    }
    @Override
    public String getMarka(){
        return marka;
    }
    @Override
    public void setMarka(String marka){
        this.marka = marka;
    }
    @Override
    public double getHiz(){
        return hiz;
    }
    @Override
    public void setHiz(double hiz){
        this.hiz = hiz;
    }
    
    @Override
    public String getRenk() {
        return renk;
    }

    @Override
    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    @Override
    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    @Override
    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    @Override
    public int getUretimYili() {
        return uretimYili;
    }

    @Override
    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    abstract String getID();
}
