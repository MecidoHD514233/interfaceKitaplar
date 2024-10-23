package ınterfacekitaplar2;
public class Universite extends Kitaplar implements IEKOlustur{
    @Override // zorunlu polymorphism
    void kitapInfo(){
        System.out.println("Kitap Adı : "+ adi);
        System.out.println("Kitap Yazari : "+ yazar);
        System.out.println("Bu kitap Universite kitabidir.");
    }
    @Override // isteğe bağlı polymorphism
    void kitapGetir(){
        System.out.println("Universite Kitap kategorisinden kitap alindi");
    }
    @Override // zorunlu polymorphism
    public void baskiAl(){
        System.out.println("Universite Kitap kategorisinden baski alindi");
    }
    @Override // zorunlu polymorphism
    public void eKitapOlustur(){
        System.out.println("Universite Kitap E-Kitap Olusturuldu.");
    }
    @Override // zorunlu polymorphism
    public void formatAl(){
        System.out.println("Universite Kitap .pdf formatında hazirlandi.");
    }
}
