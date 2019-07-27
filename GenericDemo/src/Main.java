public class Main {

    public static void main(String[] args) {

        FutbolOyuncu f1 = new FutbolOyuncu("semih");
        FutbolOyuncu f2 = new FutbolOyuncu("furkan");

        BasketOyuncu b1 = new BasketOyuncu("kadir");
        BasketOyuncu b2 = new BasketOyuncu("emir");


        Takim<FutbolOyuncu> fb = new Takim("Fenerbahce Futbol Takımı");
        Takim<FutbolOyuncu> gs = new Takim("Galatasaray Futbol Takımı");
        Takim<FutbolOyuncu> bjk = new Takim("Beşiktaş Futbol Takımı");
        Takim<FutbolOyuncu> ts = new Takim("Trabzon Futbol Takımı");

        Takim<BasketOyuncu> anadoluEfes = new Takim("Anadolu Efes Basket Takımı");
        Takim<BasketOyuncu> pinarKarsiyaka = new Takim("Pınar Karşıyaka Basket Takımı");


        fb.oyuncuEkle(f1);
        fb.oyuncuEkle(f2);
        System.out.println(fb.toplamOyuncuSayisi());

        anadoluEfes.oyuncuEkle(b1);
        anadoluEfes.oyuncuEkle(b2);

        fb.macYap(gs,3,2);
        bjk.macYap(ts,2,1);
        fb.macYap(bjk,4,1);
        gs.macYap(ts,2,2);
        ts.macYap(fb,1,1);
        gs.macYap(bjk,4,4);



        System.out.println("FB Toplam Skor: " + fb.toplamTakimPuani());
        System.out.println("GS Toplam Skor: " + gs.toplamTakimPuani());
        System.out.println("BJK Toplam Skor: " + bjk.toplamTakimPuani());
        System.out.println("TS Toplam Skor: " + ts.toplamTakimPuani());


        Lig<Takim<FutbolOyuncu>> futbolLigi = new Lig("Süper 1. Lig");
        futbolLigi.takimEkle(fb);
        futbolLigi.takimEkle(gs);
        futbolLigi.takimEkle(bjk);
        futbolLigi.takimEkle(ts);

        futbolLigi.puanTablosu();
    }
}
