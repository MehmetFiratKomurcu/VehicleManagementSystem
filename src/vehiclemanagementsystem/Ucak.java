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
public class Ucak implements HavaTasitlari{
    private String marka,renk;
    private int yolcuSayisi,tekerlekSayisi,uretimYili;
    private double fiyat,hiz;
    private boolean indiMi=false;
    public static int counter = 0;
    private String ID;
    public Ucak(){
        setMarka("BOEING");
        setRenk("Beyaz");
        setYolcuSayisi(440);
        setTekerlekSayisi(14);
        setUretimYili(2017);
        setFiyat(1500000);
        setHiz(0);
        counter++;
        setID(counter);
    }
    public Ucak(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili, double fiyat, double hiz){
        setMarka(marka);
        setRenk(renk);
        setYolcuSayisi(yolcuSayisi);
        setTekerlekSayisi(tekerlekSayisi);
        setUretimYili(uretimYili);
        setFiyat(fiyat);
        setHiz(hiz);
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
    public void inis(){
        indiMi = true;
    }
    public boolean getIndiMi(){
        return indiMi;
    }
    @Override
    public void hizlan(double hiz){
       setHiz(getHiz() + hiz);
       indiMi=false;
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
        if(indiMi == true)
            setHiz(0);
        else{
            System.out.println("\nUçak iniş yapmadı\n");
        }
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
    public int getCounter(){
        return counter;
    }
    public void setCounter(int count){
        counter=count;
    }
}
