package ınterfacekitaplar2;
public class Roman extends Kitaplar implements IEKOlustur , ISeslendir{
    @Override
    void kitapInfo(){
        System.out.println("Kitap Adı : "+ adi);
        System.out.println("Kitap Yazari : "+ yazar);
        System.out.println("Bu kitap Roman kitabidir.");
    }
    @Override // Zorunlu polymorphism
    public void baskiAl(){
        System.out.println("Roman Kitap kategorisinden kitap alindi");
    }
    @Override // Zorunlu polymorphism
    public void seslendir(){
        System.out.println("Roman Kitap seslendirildi");
    }
    @Override // Zorunlu polymorphism
    public void boyut(){
        System.out.println("Roman Kitap seslendirildi. Boyut 800 MB");
    }
    @Override // zorunlu polymorphism
    public void eKitapOlustur(){
        System.out.println("Roman Kitap E-Kitap Olusturuldu.");
    }
    @Override // zorunlu polymorphism
    public void formatAl(){
        System.out.println("Roman Kitap .docx formatında hazirlandi.");
    }
}
