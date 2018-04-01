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
public class UcanGemi extends DenizTasitlari implements HavaTasitlari{
    private boolean indiMi=false;
    public static int counter = 0;
    private String ID;
    public UcanGemi(){
        super("YuruyenUcak", "Turkuaz", 4, 20, 2090, 50 , 0);
        counter++;
        setID(counter);
    }
    public UcanGemi(String marka, String renk, int yolcuSayisi,int tekerlekSayisi,int uretimYili,double fiyat, double hiz){
        super(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz);
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
    public void inis(){
        indiMi = true;
    }
    public boolean getIndiMi(){
        return indiMi;
    }
    public int getCounter(){
        return counter;
    }
    public void setCounter(int count){
        counter=count;
    }
    
}
