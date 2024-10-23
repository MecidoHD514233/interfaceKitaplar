package ınterfacekitaplar2;
public class InterfaceKitaplar2 {
    public static void main(String[] args) {
        Universite uk1=new Universite();
        uk1.adi="Algorithms";
        uk1.yazar="Bahadir Atalay";
        uk1.kitapInfo();
        uk1.baskiAl();
        uk1.eKitapOlustur();
        uk1.formatAl();
        uk1.kitapGetir();
        System.out.println(IBaskiAl.baskiUcreti);
        
        Kitaplar uk2=new Universite();
        uk2.adi="Algorithms";
        uk2.yazar="Bahadir Atalay";
        uk2.kitapInfo();
        uk2.baskiAl();
        //uk2.eKitapOlustur();
        //uk2.formatAl();
        uk2.kitapGetir();
        System.out.println(IBaskiAl.baskiUcreti);
        
        Cocuk ck1=new Cocuk();
        ck1.adi="PEPE";
        ck1.yazar="Anonim";
        ck1.kitapInfo();
        ck1.kitapGetir();// 
        ck1.seslendir();
        ck1.baskiAl();
        ck1.boyut();
        
        Kitaplar ck2=new Cocuk();
        ck2.adi="PEPE";
        ck2.yazar="Anonim";
        ck2.kitapInfo();
        ck2.kitapGetir();// 
        //ck2.seslendir();
        ck2.baskiAl();
        //ck2.boyut();
        
        Roman rk1=new Roman();
        rk1.adi="ÇALIKUŞU";
        rk1.yazar="REŞAT NURİ GÜNTEKİN";
        rk1.kitapInfo();
        rk1.baskiAl();
        rk1.boyut();
        rk1.eKitapOlustur();
        rk1.formatAl();
        rk1.kitapGetir();
        rk1.seslendir();
        
        Kitaplar rk2=new Roman();
        rk2.adi="ÇALIKUŞU";
        rk2.yazar="REŞAT NURİ GÜNTEKİN";
        rk2.kitapInfo();
        rk2.baskiAl();
        //rk2.boyut();
        //rk2.eKitapOlustur();
        //rk2.formatAl();
        rk2.kitapGetir();
        //rk2.seslendir();
        
    }
}
