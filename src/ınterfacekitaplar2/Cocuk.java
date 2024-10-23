package ınterfacekitaplar2;
public class Cocuk extends Kitaplar implements ISeslendir{
    
    @Override
    void kitapInfo(){
        System.out.println("Kitap Adı : "+ adi);
        System.out.println("Kitap Yazari : "+ yazar);
        System.out.println("Bu kitap Cocuk kitabidir.");
    }
    @Override // Zorunlu polymorphism
    public void baskiAl(){
        System.out.println("Cocuk Kitap kategorisinden kitap alindi");
    }
    @Override // Zorunlu polymorphism
    public void seslendir(){
        System.out.println("Cocuk Kitap seslendirildi");
    }
    @Override // Zorunlu polymorphism
    public void boyut(){
        System.out.println("Cocuk Kitap seslendirildi. Boyut 500 MB");
    }
}
