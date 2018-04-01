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
public abstract class KaraTasitlari implements Arac{
    private String marka,renk,yakit;
    private int yolcuSayisi,tekerlekSayisi,uretimYili;
    private double fiyat,hiz;
    private boolean motorluMu;
    
    
    public KaraTasitlari(){
        setMarka("Mercedes");
        setRenk("Gri");
        setYolcuSayisi(4);
        setTekerlekSayisi(4);
        setUretimYili(2018);
        setFiyat(500000);
        setHiz(0);
        setMotorluMu(true);
    }
    public KaraTasitlari(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili, double fiyat, double hiz,boolean motorluMu){
        setMarka(marka);
        setRenk(renk);
        setYolcuSayisi(yolcuSayisi);
        setTekerlekSayisi(tekerlekSayisi);
        setUretimYili(uretimYili);
        setFiyat(fiyat);
        setHiz(hiz);
        setMotorluMu(motorluMu);
    }
    
    public boolean isMotorluMu() {
        return motorluMu;
    }

    public void setMotorluMu(boolean motorluMu) {
        this.motorluMu = motorluMu;
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
    
    @Override
    public void hizlan(double hiz){
       setHiz(getHiz() + hiz);
    }
    @Override
    public void yavasla(double hiz){
        if(getHiz() - hiz < 0){
            dur();
        }else{
            setHiz(getHiz() - hiz);
        }
    }
    @Override
    public void dur(){
        setHiz(0);
    }
    public String getYakitTuru(){
        return yakit;
    }
    public void setYakitTuru(String yakitTuru){}
    
    abstract String getID();
}
