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
public interface HavaTasitlari extends Arac{
    public void inis();
    public boolean getIndiMi();
    abstract String getID();
}
