public class BabaBurger extends Hamburger{

    public BabaBurger() {

        super("Baba Burger", "Beyaz", "Kırmızı", 14.90);
        super.ekleIlaveUrun1("Patates kızartması", 2.5);
        super.ekleIlaveUrun2("kola",3.5);
    }

    @Override
    public void ekleIlaveUrun1(String ad, double ucret) {
        System.out.println("ILAVE URUN EKLEYEMEZSINIZ");
    }

    @Override
    public void ekleIlaveUrun2(String ad, double ucret) {
        System.out.println("ILAVE URUN EKLEYEMEZSINIZ");
    }

    @Override
    public void ekleIlaveUrun3(String ad, double ucret) {
        System.out.println("ILAVE URUN EKLEYEMEZSINIZ");
    }

    @Override
    public void ekleIlaveUrun4(String ad, double ucret) {
        System.out.println("ILAVE URUN EKLEYEMEZSINIZ");
    }
}
