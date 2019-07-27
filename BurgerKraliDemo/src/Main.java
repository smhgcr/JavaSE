public class Main {

    public static void main(String[] args) {

        Hamburger h1 = new Hamburger("Sade","Beyaz Ekmek","Kırmızı Et", 7.90);
        h1.ekleIlaveUrun1("Patates Kızartması", 3.30);
        h1.ekleIlaveUrun2("Kola", 3.50);
        h1.ekleIlaveUrun3("sos", 1.20);
        h1.ekleIlaveUrun4("sogan",0.20);
        System.out.println("TOPLAM TUTAR: " + h1.hamburgerBilgileri());

        SaglikliBurger sg = new SaglikliBurger("Beyaz", 4.90);
        sg.ekleIlaveUrun1("Patates Kızartması", 3.30);
        sg.ekleIlaveUrun2("Kola", 3.50);
        sg.ekleIlaveUrun3("sos", 1.20);
        sg.ekleIlaveUrun4("sogan",0.20);
        sg.ekleSaglikliUrun1("ton balığı", 1.50);
        sg.ekleSaglikliUrun2("domates", 2.20);
        System.out.println("Toplam Tutar: " + sg.hamburgerBilgileri());

        BabaBurger bg = new BabaBurger();
        System.out.println("TOPLAM TUTAR: " + bg.hamburgerBilgileri());

    }
}
