public class SaglikliBurger extends Hamburger {

    private String ilaveSaglikliUrunAdi1;
    private double ilaveSaglikliUrunUcreti1;

    private String ilaveSaglikliUrunAdi2;
    private double ilaveSaglikliUrunUcreti2;

    public SaglikliBurger(String etCesiti, double ucreti) {
        super("Sağlıklı Burger","Kepekli Ekmek", etCesiti, ucreti);
    }

    public void ekleSaglikliUrun1(String ad, double fiyat){
        this.ilaveSaglikliUrunAdi1 = ad;
        this.ilaveSaglikliUrunUcreti1 = fiyat;
    }

    public void ekleSaglikliUrun2(String ad, double fiyat){
        this.ilaveSaglikliUrunAdi2 = ad;
        this.ilaveSaglikliUrunUcreti2 = fiyat;
    }

    @Override
    public double hamburgerBilgileri() {

        double toplamUcret = super.hamburgerBilgileri();

        if(this.ilaveSaglikliUrunAdi1 != null){

            toplamUcret += ilaveSaglikliUrunUcreti1;
            System.out.println("İlave Sağlıklı Burger Ürünü: " + this.ilaveSaglikliUrunAdi1 + " Fiyatı: " + this.ilaveSaglikliUrunUcreti1);
        }
        if(this.ilaveSaglikliUrunAdi2 != null){

            toplamUcret += ilaveSaglikliUrunUcreti2;
            System.out.println("İlave Sağlıklı Burger Ürünü: " + this.ilaveSaglikliUrunAdi2 + " Fiyatı: " + this.ilaveSaglikliUrunUcreti2);
        }
        return toplamUcret;
    }
}
