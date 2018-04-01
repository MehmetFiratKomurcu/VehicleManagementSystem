/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ali Recep KARACA and Mehmet Firat KOMURCU
 */



public class VehicleManagementSystem {
    
    public static void VeriGirisiListesi(){

        System.out.println("Veri girisinde bulunacaginiz araci seciniz : ");
        System.out.println("1.Otomobil");
        System.out.println("2.Bisiklet");
        System.out.println("3.Gemi");
        System.out.println("4.Uçak");
        System.out.println("5.UçanGemi");
        System.out.println("9.Önceki Menüye Dön");
        Scanner Holder = new Scanner(System.in);
        
        int girisSayisi = Holder.nextInt();
        String marka,renk,yakitTuru;
        int yolcuSayisi,tekerlekSayisi,uretimYili,flag=0;
        double fiyat,hiz = 0;
        if(girisSayisi == 1){
            System.out.println("Yeni otomobilin markasini giriniz.");
            marka = Holder.next();
            System.out.println("Yeni otomobilin rengini giriniz.");
            renk = Holder.next();
            System.out.println("Yeni otomobilin yolcu sayisini giriniz.");
            yolcuSayisi = Holder.nextInt();
            System.out.println("Yeni otomobilin tekerlek sayisini giriniz.");
            tekerlekSayisi = Holder.nextInt();
            System.out.println("Yeni otomobilin uretim yilini giriniz.");
            uretimYili = Holder.nextInt();
            System.out.println("Yeni otomobilin fiyatini giriniz.");
            fiyat = Holder.nextDouble();
            System.out.println("Yeni otomobilin yakit turunu giriniz.");
            do{
                String yakitTurleri[] = new String[]{"Dizel", "Benzin", "LPG", "Elektrik"};
                flag=0;
                yakitTuru=Holder.next();
                if(Arrays.asList(yakitTurleri).contains(yakitTuru)==false){
                    System.out.println("Böyle bir yakit turu bulunmamaktadir."); 
                    flag=1;
                }
            }while(flag==1);
            karaTasitlar.add(new Otomobil(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz,yakitTuru));
        }else if(girisSayisi == 2){
            System.out.println("Yeni bisikletin markasini giriniz.");
            marka = Holder.next();
            System.out.println("Yeni bisikletin rengini giriniz.");
            renk = Holder.next();
            System.out.println("Yeni bisikletin yolcu sayisini giriniz.");
            yolcuSayisi = Holder.nextInt();
            System.out.println("Yeni bisikletin tekerlek sayisini giriniz.");
            tekerlekSayisi = Holder.nextInt();
            System.out.println("Yeni bisikletin uretim yilini giriniz.");
            uretimYili = Holder.nextInt();
            System.out.println("Yeni bisikletin fiyatini giriniz.");
            fiyat = Holder.nextDouble();
            karaTasitlar.add(new Bisiklet(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
        }else if(girisSayisi == 3){
            System.out.println("Yeni geminin markasini giriniz.");
            marka = Holder.next();
            System.out.println("Yeni geminin rengini giriniz.");
            renk = Holder.next();
            System.out.println("Yeni geminin yolcu sayisini giriniz.");
            yolcuSayisi = Holder.nextInt();
            System.out.println("Yeni geminin uretim yilini giriniz.");
            uretimYili = Holder.nextInt();
            System.out.println("Yeni geminin fiyatini giriniz.");
            fiyat = Holder.nextDouble();
            denizTasitlar.add(new Gemi(marka,renk,yolcuSayisi,0,uretimYili,fiyat,hiz));
        }else if(girisSayisi == 4){
            System.out.println("Yeni uçağın markasini giriniz.");
            marka = Holder.next();
            System.out.println("Yeni uçağın rengini giriniz.");
            renk = Holder.next();
            System.out.println("Yeni uçağın yolcu sayisini giriniz.");
            yolcuSayisi = Holder.nextInt();
            System.out.println("Yeni uçağın tekerlek sayisini giriniz.");
            tekerlekSayisi = Holder.nextInt();
            System.out.println("Yeni uçağın uretim yilini giriniz.");
            uretimYili = Holder.nextInt();
            System.out.println("Yeni uçağın fiyatini giriniz.");
            fiyat = Holder.nextDouble();
            havaTasitlar.add(new Ucak(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
        }else if(girisSayisi == 5){
            UcanGemi ucan;
            System.out.println("Yeni uçan geminin markasini giriniz.");
            marka = Holder.next();
            System.out.println("Yeni uçan geminin rengini giriniz.");
            renk = Holder.next();
            System.out.println("Yeni uçan geminin yolcu sayisini giriniz.");
            yolcuSayisi = Holder.nextInt();
            System.out.println("Yeni uçan geminin tekerlek sayisini giriniz.");
            tekerlekSayisi = Holder.nextInt();
            System.out.println("Yeni uçan geminin uretim yilini giriniz.");
            uretimYili = Holder.nextInt();
            System.out.println("Yeni uçan geminin fiyatini giriniz.");
            fiyat = Holder.nextDouble();
            ucan=new UcanGemi(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz);
            havaTasitlar.add(ucan);
            denizTasitlar.add(ucan);
        }else if(girisSayisi == 9){
            
        }
    }
    public static void VeriListele(){
        Scanner okuyucu = new Scanner(System.in);
        int i,giris;
        
        System.out.println("");
        System.out.println("Listelemek istediğiniz veri tipini giriniz: ");
        System.out.println("1. Kara Taşıtları");
        System.out.println("2. Deniz Taşıtları");
        System.out.println("3. Hava Taşıtları");
        System.out.println("9. Bir önceki menüye dön.");
        giris = okuyucu.nextInt();
        if(giris == 1){
            for(i=0;i<karaTasitlar.size();i++){
                System.out.println("ID: " + karaTasitlar.get(i).getID());
                System.out.println("Marka: " + karaTasitlar.get(i).getMarka());
                System.out.println("Renk: " + karaTasitlar.get(i).getRenk());
                System.out.println("Yolcu Sayısı: " + karaTasitlar.get(i).getYolcuSayisi());
                System.out.println("Tekerlek Sayısı: " + karaTasitlar.get(i).getTekerlekSayisi());
                System.out.println("Üretim Yılı: " + karaTasitlar.get(i).getUretimYili());
                System.out.println("Fiyatı: " + karaTasitlar.get(i).getFiyat());
                System.out.println("Hızı: " + karaTasitlar.get(i).getHiz());
                if(karaTasitlar.get(i).getID().startsWith("Otomobil")){
                    System.out.println("Yakıt Türü: " + karaTasitlar.get(i).getYakitTuru());
                }
                System.out.println("");
            }
            if(i==0){
                System.out.println("\nHiçbir kara taşıtı bulunmamakta.\n");
            }
        }else if(giris == 2){
            for(i=0;i<denizTasitlar.size();i++){
                System.out.println("ID: " + denizTasitlar.get(i).getID());
                System.out.println("Marka: " + denizTasitlar.get(i).getMarka());
                System.out.println("Renk: " + denizTasitlar.get(i).getRenk());
                System.out.println("Yolcu Sayısı: " + denizTasitlar.get(i).getYolcuSayisi());
                System.out.println("Üretim Yılı: " + denizTasitlar.get(i).getUretimYili());
                System.out.println("Fiyatı: " + denizTasitlar.get(i).getFiyat());
                System.out.println("Hızı: " + denizTasitlar.get(i).getHiz());
                System.out.println("");
            }
            if(i==0){
                System.out.println("\nHiçbir deniz taşıtı bulunmamakta.\n");
            }
        }else if(giris == 3){
            for(i=0;i<havaTasitlar.size();i++){
                System.out.println("ID: " + havaTasitlar.get(i).getID());
                System.out.println("Marka: " + havaTasitlar.get(i).getMarka());
                System.out.println("Renk: " + havaTasitlar.get(i).getRenk());
                System.out.println("Yolcu Sayısı: " + havaTasitlar.get(i).getYolcuSayisi());
                System.out.println("Tekerlek Sayısı: " + havaTasitlar.get(i).getTekerlekSayisi());
                System.out.println("Üretim Yılı: " + havaTasitlar.get(i).getUretimYili());
                System.out.println("Fiyatı: " + havaTasitlar.get(i).getFiyat());
                System.out.println("Hızı: " + havaTasitlar.get(i).getHiz());
                System.out.println("");
            }
            if(i==0){
                System.out.println("\nHiçbir hava taşıtı bulunmamakta.\n");
            }
        } 
    }
    public static void VeriGuncelle(){
        boolean flag;
        int secim,hizSecim,sayac=0,intOku,bulunanIndis=0;
        double doubleOku;
        String alinanID,stringOku;
        Scanner okuyucu = new Scanner(System.in);
        do{
            flag=false;
            System.out.println("Güncelleyeceğiniz verinin ID numarasını giriniz: ");
            alinanID=okuyucu.next();
            if(!alinanID.startsWith("Otomobil") && !alinanID.startsWith("Bisiklet") && !alinanID.startsWith("Gemi") && !alinanID.startsWith("Ucak") && !alinanID.startsWith("UcanGemi")){
                System.out.println("Hatalı bir ID girişi yaptınız.\n");
                flag = true;
            }else{
                sayac=0;
                if(alinanID.startsWith("Otomobil") || alinanID.startsWith("Bisiklet")){
                    for(int i=0;i<karaTasitlar.size();i++){
                        if(karaTasitlar.get(i).getID().equals(alinanID)){
                            sayac++;
                        }
                    }
                    if(sayac==0){
                        System.out.println("Hatalı bir ID girişi yaptınız.\n");
                        flag=true;
                    }
                }else if(alinanID.startsWith("Gemi")){
                    for(int i=0;i<denizTasitlar.size();i++){
                        if(denizTasitlar.get(i).getID().equals(alinanID)){
                            sayac++;
                        }
                    }
                    if(sayac==0){
                        System.out.println("Hatalı bir ID girişi yaptınız.\n");
                        flag=true;
                    }
                }else if(alinanID.startsWith("Ucak") || alinanID.startsWith("UcanGemi")){
                    for(int i=0;i<havaTasitlar.size();i++){
                        if(havaTasitlar.get(i).getID().equals(alinanID)){
                            sayac++;
                        }
                    }
                    if(sayac==0){
                        System.out.println("Hatalı bir ID girişi yaptınız.\n");
                        flag=true;
                    }
                }
            }
        }while(flag == true);
        if(alinanID.startsWith("Otomobil")){
            System.out.println("Seçtiğiniz otomobil nesnesi üzerinde değiştireceğiniz özelliği seçiniz:\n");
            System.out.println("1. Marka");
            System.out.println("2. Renk");
            System.out.println("3. Yolcu Sayısı");
            System.out.println("4. Tekerlek Sayısı");
            System.out.println("5. Üretim Yılı");
            System.out.println("6. Fiyat");
            System.out.println("7. Hız");
            System.out.println("8. Yakıt Türü");
            System.out.println("9. Nesneyi sil.");
            System.out.println("0. Ana Menüye Dön\n");
            secim = okuyucu.nextInt();
            for(int i=0;i<karaTasitlar.size();i++){
                if(karaTasitlar.get(i).getID().equals(alinanID)){
                    bulunanIndis = i;
                    break;
                }
            }
            if(secim == 1){
                System.out.println("Yeni markayı giriniz:");
                stringOku = okuyucu.next();
                karaTasitlar.get(bulunanIndis).setMarka(stringOku);
            }else if(secim == 2){
                System.out.println("Yeni rengi giriniz:");
                stringOku = okuyucu.next();
                karaTasitlar.get(bulunanIndis).setRenk(stringOku);
            }else if(secim == 3){
                System.out.println("Yeni yolcu sayısını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setYolcuSayisi(intOku);
            }else if(secim == 4){
                System.out.println("Yeni tekerlek sayısını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setTekerlekSayisi(intOku);
            }else if(secim == 5){
                System.out.println("Yeni üretim yılını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setUretimYili(intOku);
            }else if(secim == 6){
                System.out.println("Yeni fiyatı giriniz:");
                doubleOku = okuyucu.nextDouble();
                karaTasitlar.get(bulunanIndis).setFiyat(doubleOku);
            }else if(secim == 7){
                System.out.println("Hız menüsü");
                System.out.println("1. Hızlan");
                System.out.println("2. Yavaşla");
                System.out.println("3. Dur");
                hizSecim = okuyucu.nextInt();
                if(hizSecim == 1){
                    System.out.println("Hızlanmak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    karaTasitlar.get(bulunanIndis).hizlan(doubleOku);
                }else if(hizSecim == 2){
                    System.out.println("Yavaşlamak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    karaTasitlar.get(bulunanIndis).yavasla(doubleOku);
                }else if(hizSecim == 3){
                    karaTasitlar.get(bulunanIndis).dur();
                }
            }else if(secim == 8){
                System.out.println("Yeni yakıt türünü giriniz:");
                stringOku = okuyucu.next();
                karaTasitlar.get(bulunanIndis).setYakitTuru(stringOku);
            }else if(secim == 9){
                karaTasitlar.remove(bulunanIndis);
            }
        }else if(alinanID.startsWith("Bisiklet")){
            System.out.println("Seçtiğiniz bisiklet nesnesi üzerinde değiştireceğiniz özelliği seçiniz:\n");
            System.out.println("1. Marka");
            System.out.println("2. Renk");
            System.out.println("3. Yolcu Sayısı");
            System.out.println("4. Tekerlek Sayısı");
            System.out.println("5. Üretim Yılı");
            System.out.println("6. Fiyat");
            System.out.println("7. Hız");
            System.out.println("8. Nesneyi sil.");
            System.out.println("0. Ana Menüye Dön\n");
            secim = okuyucu.nextInt();
            for(int i=0;i<karaTasitlar.size();i++){
                if(karaTasitlar.get(i).getID().equals(alinanID)){
                    bulunanIndis = i;
                    break;
                }
            }
            if(secim == 1){
                System.out.println("Yeni markayı giriniz:");
                stringOku = okuyucu.next();
                karaTasitlar.get(bulunanIndis).setMarka(stringOku);
            }else if(secim == 2){
                System.out.println("Yeni rengi giriniz:");
                stringOku = okuyucu.next();
                karaTasitlar.get(bulunanIndis).setRenk(stringOku);
            }else if(secim == 3){
                System.out.println("Yeni yolcu sayısını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setYolcuSayisi(intOku);
            }else if(secim == 4){
                System.out.println("Yeni tekerlek sayısını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setTekerlekSayisi(intOku);
            }else if(secim == 5){
                System.out.println("Yeni üretim yılını giriniz:");
                intOku = okuyucu.nextInt();
                karaTasitlar.get(bulunanIndis).setUretimYili(intOku);
            }else if(secim == 6){
                System.out.println("Yeni fiyatı giriniz:");
                doubleOku = okuyucu.nextDouble();
                karaTasitlar.get(bulunanIndis).setFiyat(doubleOku);
            }else if(secim == 7){
                System.out.println("Hız menüsü");
                System.out.println("1. Hızlan");
                System.out.println("2. Yavaşla");
                System.out.println("3. Dur");
                hizSecim = okuyucu.nextInt();
                if(hizSecim == 1){
                    System.out.println("Hızlanmak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    karaTasitlar.get(bulunanIndis).hizlan(doubleOku);
                }else if(hizSecim == 2){
                    System.out.println("Yavaşlamak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    karaTasitlar.get(bulunanIndis).yavasla(doubleOku);
                }else if(hizSecim == 3){
                    karaTasitlar.get(bulunanIndis).dur();
                }
            }else if(secim == 8){
                karaTasitlar.remove(bulunanIndis);
            }
        }else if(alinanID.startsWith("Gemi")){
            System.out.println("Seçtiğiniz gemi nesnesi üzerinde değiştireceğiniz özelliği seçiniz:\n");
            System.out.println("1. Marka");
            System.out.println("2. Renk");
            System.out.println("3. Yolcu Sayısı");
            System.out.println("4. Üretim Yılı");
            System.out.println("5. Fiyat");
            System.out.println("6. Hız");
            System.out.println("7. Nesneyi sil.");
            System.out.println("0. Ana Menüye Dön\n");
            secim = okuyucu.nextInt();
            for(int i=0;i<denizTasitlar.size();i++){
                if(denizTasitlar.get(i).getID().equals(alinanID)){
                    bulunanIndis = i;
                    break;
                }
            }
            if(secim == 1){
                System.out.println("Yeni markayı giriniz:");
                stringOku = okuyucu.next();
                denizTasitlar.get(bulunanIndis).setMarka(stringOku);
            }else if(secim == 2){
                System.out.println("Yeni rengi giriniz:");
                stringOku = okuyucu.next();
                denizTasitlar.get(bulunanIndis).setRenk(stringOku);
            }else if(secim == 3){
                System.out.println("Yeni yolcu sayısını giriniz:");
                intOku = okuyucu.nextInt();
                denizTasitlar.get(bulunanIndis).setYolcuSayisi(intOku);
            }else if(secim == 4){
                System.out.println("Yeni üretim yılını giriniz:");
                intOku = okuyucu.nextInt();
                denizTasitlar.get(bulunanIndis).setUretimYili(intOku);
            }else if(secim == 5){
                System.out.println("Yeni fiyatı giriniz:");
                doubleOku = okuyucu.nextDouble();
                denizTasitlar.get(bulunanIndis).setFiyat(doubleOku);
            }else if(secim == 6){
                System.out.println("Hız menüsü");
                System.out.println("1. Hızlan");
                System.out.println("2. Yavaşla");
                System.out.println("3. Dur");
                hizSecim = okuyucu.nextInt();
                if(hizSecim == 1){
                    System.out.println("Hızlanmak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    denizTasitlar.get(bulunanIndis).hizlan(doubleOku);
                }else if(hizSecim == 2){
                    System.out.println("Yavaşlamak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    denizTasitlar.get(bulunanIndis).yavasla(doubleOku);
                }else if(hizSecim == 3){
                    denizTasitlar.get(bulunanIndis).dur();
                }
            }else if(secim == 7){
                denizTasitlar.remove(bulunanIndis);
            }
        }else if(alinanID.startsWith("Ucak") || alinanID.startsWith("UcanGemi")){
            System.out.println("Seçtiğiniz uçak nesnesi üzerinde değiştireceğiniz özelliği seçiniz:\n");
            System.out.println("1. Marka");
            System.out.println("2. Renk");
            System.out.println("3. Yolcu Sayısı");
            System.out.println("4. Üretim Yılı");
            System.out.println("5. Fiyat");
            System.out.println("6. Hız");
            System.out.println("7. Nesneyi sil.");
            System.out.println("8. Tekerlek Sayısı");
            System.out.println("0. Ana Menüye Dön\n");
            secim = okuyucu.nextInt();
            for(int i=0;i<havaTasitlar.size();i++){
                if(havaTasitlar.get(i).getID().equals(alinanID)){
                    bulunanIndis = i;
                    break;
                }
            }
            if(secim == 1){
                System.out.println("Yeni markayı giriniz:");
                stringOku = okuyucu.next();
                havaTasitlar.get(bulunanIndis).setMarka(stringOku);
            }else if(secim == 2){
                System.out.println("Yeni rengi giriniz:");
                stringOku = okuyucu.next();
                havaTasitlar.get(bulunanIndis).setRenk(stringOku);
            }else if(secim == 3){
                System.out.println("Yeni yolcu sayısını giriniz:");
                intOku = okuyucu.nextInt();
                havaTasitlar.get(bulunanIndis).setYolcuSayisi(intOku);
            }else if(secim == 4){
                System.out.println("Yeni üretim yılını giriniz:");
                intOku = okuyucu.nextInt();
                havaTasitlar.get(bulunanIndis).setUretimYili(intOku);
            }else if(secim == 5){
                System.out.println("Yeni fiyatı giriniz:");
                doubleOku = okuyucu.nextDouble();
                havaTasitlar.get(bulunanIndis).setFiyat(doubleOku);
            }else if(secim == 6){
                System.out.println("Hız menüsü");
                System.out.println("1. Hızlan");
                System.out.println("2. Yavaşla");
                System.out.println("3. Dur");
                System.out.println("4. İniş Yap");
                System.out.println("0. Ana Menüye Dön");
                hizSecim = okuyucu.nextInt();
                if(hizSecim == 1){
                    System.out.println("Hızlanmak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    havaTasitlar.get(bulunanIndis).hizlan(doubleOku);
                }else if(hizSecim == 2){
                    System.out.println("Yavaşlamak istediğiniz miktarı giriniz:");
                    doubleOku = okuyucu.nextDouble();
                    havaTasitlar.get(bulunanIndis).yavasla(doubleOku);
                }else if(hizSecim == 3){
                    havaTasitlar.get(bulunanIndis).dur();
                }else if(hizSecim == 4){
                    if(havaTasitlar.get(bulunanIndis).getIndiMi() == true){
                        System.out.println("\nAraç zaten iniş yapmış.\n");
                    }else {
                        havaTasitlar.get(bulunanIndis).inis();
                        System.out.println("\nAraç iniş yaptı.\n");
                    }
                }
            }else if(secim == 7){
                havaTasitlar.remove(bulunanIndis);
            }else if(secim == 8){
                System.out.println("Yeni tekerlek sayısını giriniz:");
                intOku = okuyucu.nextInt();
                havaTasitlar.get(bulunanIndis).setTekerlekSayisi(intOku);
            }
        }
        System.out.println("");
    }
    
    public static ArrayList<KaraTasitlari> karaTasitlar;
    public static ArrayList<DenizTasitlari> denizTasitlar;
    public static ArrayList<HavaTasitlari> havaTasitlar;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner oku = new Scanner(System.in);
        boolean flag = true;
        karaTasitlar = new ArrayList<KaraTasitlari>();
        denizTasitlar = new ArrayList<DenizTasitlari>();
        havaTasitlar = new ArrayList<HavaTasitlari>();

        File dosya = new File("AracKayit.txt");
        if (!dosya.exists()) {
            dosya.createNewFile();
        }
        BufferedReader okuyucu = new BufferedReader(new FileReader(dosya));
        String satir = okuyucu.readLine();
        int aracTuru = 0;
        String marka,renk,yakitTuru;
        int yolcuSayisi,tekerlekSayisi,uretimYili;
        double fiyat,hiz;  
        
        //1=Otomobil , 2=Bisiklet , 3=Gemi , 4=Ucak , 5=UcanGemi
        
        do{
            flag=true;
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1.Veri Girişinde Bulun");
            System.out.println("2.Veri Listele");
            System.out.println("3.Veri Güncelle");
            System.out.println("9.Çıkış");
            
            int girilenSayi = oku.nextInt();
            
            while(satir != null){
                if(satir.startsWith("Otomobil")){
                    aracTuru = 1;
                }else if(satir.startsWith("Bisiklet")){
                    aracTuru = 2;
                }else if(satir.startsWith("Gemi")){
                    aracTuru = 3;
                }else if(satir.startsWith("Ucak")){
                    aracTuru = 4;
                }else if(satir.startsWith("UcanGemi")){
                    aracTuru = 5;
                }
                if(aracTuru == 1){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    yakitTuru=okuyucu.readLine();
                    karaTasitlar.add(new Otomobil(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz,yakitTuru));
                }else if(aracTuru == 2){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    karaTasitlar.add(new Bisiklet(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
                }else if(aracTuru == 3){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    denizTasitlar.add(new Gemi(marka,renk,yolcuSayisi,0,uretimYili,fiyat,hiz));
                }else if(aracTuru == 4){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    havaTasitlar.add(new Ucak(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
                }else if(aracTuru == 5){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    UcanGemi ucan;
                    ucan=new UcanGemi(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz);
                    havaTasitlar.add(ucan);
                    denizTasitlar.add(ucan);
                }
                satir=okuyucu.readLine();
            }
            okuyucu.close();
            if(girilenSayi == 1){
                VeriGirisiListesi();
            }else if(girilenSayi == 2){
                VeriListele();
            }else if(girilenSayi == 3){
                VeriGuncelle();
            }else if(girilenSayi == 9){
                flag=false;
            }
            
            
        }while(flag == true);
        
        FileWriter yazici = new FileWriter(dosya, false);
        BufferedWriter yaz = new BufferedWriter(yazici);
        for(int i=0;i<karaTasitlar.size();i++){
            if(karaTasitlar.get(i).getID().startsWith("Otomobil")){
                yaz.write(karaTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getTekerlekSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getHiz()));
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getYakitTuru());
                yaz.newLine();
            }else if(karaTasitlar.get(i).getID().startsWith("Bisiklet")){
                yaz.write(karaTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getTekerlekSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getHiz()));
                yaz.newLine();
            }
        }
        for(int i=0;i<denizTasitlar.size();i++){
            if(!denizTasitlar.get(i).getID().startsWith("UcanGemi")){
                yaz.write(denizTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(denizTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(denizTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(denizTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(denizTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(denizTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(denizTasitlar.get(i).getHiz()));
                yaz.newLine();
            }
        }
        for(int i=0;i<havaTasitlar.size();i++){
            yaz.write(havaTasitlar.get(i).getID());
            yaz.newLine();
            yaz.write(havaTasitlar.get(i).getMarka());
            yaz.newLine();
            yaz.write(havaTasitlar.get(i).getRenk());
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getYolcuSayisi()));
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getTekerlekSayisi()));
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getUretimYili()));
            yaz.newLine();
            yaz.write(Double.toString(havaTasitlar.get(i).getFiyat()));
            yaz.newLine();
            yaz.write(Double.toString(havaTasitlar.get(i).getHiz()));
            yaz.newLine();
        }
        yaz.close();
        
        Otomobil otm=new Otomobil();
        Bisiklet bsk=new Bisiklet();
        Gemi gm=new Gemi();
        Ucak uck=new Ucak();
        UcanGemi ucngm=new UcanGemi();
        otm.setCounter(0);
        bsk.setCounter(0);
        gm.setCounter(0);
        uck.setCounter(0);
        ucngm.setCounter(0);
        karaTasitlar.clear();
        havaTasitlar.clear();
        denizTasitlar.clear();
        
        okuyucu = new BufferedReader(new FileReader(dosya));
        satir=okuyucu.readLine();
        while(satir != null){
                if(satir.startsWith("Otomobil")){
                    aracTuru = 1;
                }else if(satir.startsWith("Bisiklet")){
                    aracTuru = 2;
                }else if(satir.startsWith("Gemi")){
                    aracTuru = 3;
                }else if(satir.startsWith("Ucak")){
                    aracTuru = 4;
                }else if(satir.startsWith("UcanGemi")){
                    aracTuru = 5;
                }
                if(aracTuru == 1){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    yakitTuru=okuyucu.readLine();
                    karaTasitlar.add(new Otomobil(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz,yakitTuru));
                }else if(aracTuru == 2){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    karaTasitlar.add(new Bisiklet(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
                }else if(aracTuru == 3){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    denizTasitlar.add(new Gemi(marka,renk,yolcuSayisi,0,uretimYili,fiyat,hiz));
                }else if(aracTuru == 4){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    havaTasitlar.add(new Ucak(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz));
                }else if(aracTuru == 5){
                    marka=okuyucu.readLine();
                    renk=okuyucu.readLine();
                    yolcuSayisi=Integer.parseInt(okuyucu.readLine());
                    tekerlekSayisi=Integer.parseInt(okuyucu.readLine());
                    uretimYili=Integer.parseInt(okuyucu.readLine());
                    fiyat=Double.parseDouble(okuyucu.readLine());
                    hiz=Double.parseDouble(okuyucu.readLine());
                    UcanGemi ucan;
                    ucan=new UcanGemi(marka,renk,yolcuSayisi,tekerlekSayisi,uretimYili,fiyat,hiz);
                    havaTasitlar.add(ucan);
                    denizTasitlar.add(ucan);
                }
                satir=okuyucu.readLine();
            }
            okuyucu.close();
            
            FileWriter yazici2 = new FileWriter(dosya, false);
            yaz = new BufferedWriter(yazici2);
            for(int i=0;i<karaTasitlar.size();i++){
            if(karaTasitlar.get(i).getID().startsWith("Otomobil")){
                yaz.write(karaTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getTekerlekSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getHiz()));
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getYakitTuru());
                yaz.newLine();
            }else if(karaTasitlar.get(i).getID().startsWith("Bisiklet")){
                yaz.write(karaTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(karaTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getTekerlekSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(karaTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(karaTasitlar.get(i).getHiz()));
                yaz.newLine();
            }
        }
        for(int i=0;i<denizTasitlar.size();i++){
            if(!denizTasitlar.get(i).getID().startsWith("UcanGemi")){
                yaz.write(denizTasitlar.get(i).getID());
                yaz.newLine();
                yaz.write(denizTasitlar.get(i).getMarka());
                yaz.newLine();
                yaz.write(denizTasitlar.get(i).getRenk());
                yaz.newLine();
                yaz.write(Integer.toString(denizTasitlar.get(i).getYolcuSayisi()));
                yaz.newLine();
                yaz.write(Integer.toString(denizTasitlar.get(i).getUretimYili()));
                yaz.newLine();
                yaz.write(Double.toString(denizTasitlar.get(i).getFiyat()));
                yaz.newLine();
                yaz.write(Double.toString(denizTasitlar.get(i).getHiz()));
                yaz.newLine();
            }
        }
        for(int i=0;i<havaTasitlar.size();i++){
            yaz.write(havaTasitlar.get(i).getID());
            yaz.newLine();
            yaz.write(havaTasitlar.get(i).getMarka());
            yaz.newLine();
            yaz.write(havaTasitlar.get(i).getRenk());
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getYolcuSayisi()));
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getTekerlekSayisi()));
            yaz.newLine();
            yaz.write(Integer.toString(havaTasitlar.get(i).getUretimYili()));
            yaz.newLine();
            yaz.write(Double.toString(havaTasitlar.get(i).getFiyat()));
            yaz.newLine();
            yaz.write(Double.toString(havaTasitlar.get(i).getHiz()));
            yaz.newLine();
        }
        yaz.close();
    }  
    
}
