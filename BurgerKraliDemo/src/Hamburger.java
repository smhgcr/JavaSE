public class Hamburger {

    private String ismi;
    private String ekmekCesidi;
    private String etCesiti;
    private double ucreti;

    private String  ilaveUrunAdi1;
    private double ilaveUrunUcret1;

    private String  ilaveUrunAdi2;
    private double ilaveUrunUcret2;

    private String  ilaveUrunAdi3;
    private double ilaveUrunUcret3;

    private String  ilaveUrunAdi4;
    private double ilaveUrunUcret4;

    public void ekleIlaveUrun1(String ad, double ucret){
        this.ilaveUrunAdi1 = ad;
        this.ilaveUrunUcret1 = ucret;

    }

    public void ekleIlaveUrun2(String ad, double ucret){
        this.ilaveUrunAdi2 = ad;
        this.ilaveUrunUcret2 = ucret;

    }

    public void ekleIlaveUrun3(String ad, double ucret){
        this.ilaveUrunAdi3 = ad;
        this.ilaveUrunUcret3 = ucret;

    }

    public void ekleIlaveUrun4(String ad, double ucret){
        this.ilaveUrunAdi4 = ad;
        this.ilaveUrunUcret4 = ucret;

    }

    public Hamburger(String ismi, String ekmekCesidi, String etCesiti, double ucreti) {
        this.ismi = ismi;
        this.ekmekCesidi = ekmekCesidi;
        this.etCesiti = etCesiti;
        this.ucreti = ucreti;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekCesidi() {
        return ekmekCesidi;
    }

    public void setEkmekCesidi(String ekmekCesidi) {
        this.ekmekCesidi = ekmekCesidi;
    }

    public String getEtCesiti() {
        return etCesiti;
    }

    public void setEtCesiti(String etCesiti) {
        this.etCesiti = etCesiti;
    }

    public double getUcreti() {
        return ucreti;
    }

    public void setUcreti(double ucreti) {
        this.ucreti = ucreti;
    }

    public double hamburgerBilgileri(){

        double toplamUcret = this.ucreti;

        System.out.println("Hamburger adı: " + this.ismi
                            +"\nEkmek Türü: " + this.ekmekCesidi
                            +"\nEt Türü: " + this.etCesiti
                            +"\nFiyat: " +this.ucreti);

        if(this.ilaveUrunAdi1 != null){

            toplamUcret += this.ilaveUrunUcret1;
            System.out.println("İlave Ürün: " + this.ilaveUrunAdi1 + " Ücreti: " + this.ilaveUrunUcret1);
        }

        if(this.ilaveUrunAdi2 != null){

            toplamUcret += this.ilaveUrunUcret2;
            System.out.println("İlave Ürün: " + this.ilaveUrunAdi2 + " Ücreti: " + this.ilaveUrunUcret2);
        }

        if(this.ilaveUrunAdi3 != null){

            toplamUcret += this.ilaveUrunUcret3;
            System.out.println("İlave Ürün: " + this.ilaveUrunAdi3 + " Ücreti: " + this.ilaveUrunUcret3);
        }

        if(this.ilaveUrunAdi4 != null){

            toplamUcret += this.ilaveUrunUcret4;
            System.out.println("İlave Ürün: " + this.ilaveUrunAdi4 + " Ücreti: " + this.ilaveUrunUcret4);
        }

        return toplamUcret;
    }
}
