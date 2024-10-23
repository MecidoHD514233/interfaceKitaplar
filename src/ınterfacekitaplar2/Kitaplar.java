package ınterfacekitaplar2;
public abstract class Kitaplar implements IBaskiAl{
    String adi;
    String ISBN;
    String yazar;
    double fiyati;
    String basimYili;
    Kitaplar(){
    
    }
    Kitaplar(String adi,String ISBN,String yazar,double fiyati,String basimYili){
        this.adi=adi;
        this.ISBN=ISBN;
        this.yazar=yazar;
        this.fiyati=fiyati;
        this.basimYili=basimYili;
    }
    void kitapGetir(){
        System.out.println("Kitap kategorisinden kitap alindi");
    }
    abstract void kitapInfo();
}
