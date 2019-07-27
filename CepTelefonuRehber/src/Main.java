import java.util.Scanner;

public class Main {

    private static Scanner tara = new Scanner(System.in);

    private static CepTelefonu cepTelefonu = new CepTelefonu("555 555 55 55");

    public static void main(String[] args) {


        telefonBaslat();
        menuGoster();
        boolean cikis=false;

        while(!cikis){

            System.out.println("SEÇİMİNİZ (Menüyü görmek için 6'yı tuşlayınız.)");
            int secim = tara.nextInt();

            switch (secim){

                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    cikis=true;
                    break;
                case 1:
                    cepTelefonu.tumRehber();
                    break;
                case 2:
                    yeniKisiEkleMethodu();
                    break;
                case 3:
                    kisiSorgulaMethodu();
                    break;
                case 4:
                    kisiSilMethodu();
                    break;
                case 5:
                    kisiGuncellemeMethodu();
                    break;
                case 6:
                    menuGoster();
                    break;

                    default:
                        System.out.println("Düzgün Seçim Yapınız.");

            }
        }

    }

    private static void kisiGuncellemeMethodu() {

        System.out.println("Güncellenecek kişinin adı");
        String isim = tara.next();

        Kisi bulunanKisi = cepTelefonu.kisiSorgula(isim);
        if(bulunanKisi == null){
            System.out.println("Kayıt bulunamadı.");
            return;
        }
        System.out.println("Yeni isim değeri: ");
        String yeniIsim = tara.next();
        System.out.println("Yeni telefon değeri: ");
        String yeniTelno = tara.next();

        Kisi yeniKisi = Kisi.olustur(yeniIsim,yeniTelno);

        cepTelefonu.kisiGuncelle(bulunanKisi,yeniKisi);

    }

    private static void kisiSilMethodu() {

        System.out.println("Silinecek kişinin adı");
        String isim = tara.next();

        Kisi bulunanKisi = cepTelefonu.kisiSorgula(isim);

        if(cepTelefonu.kisiSil(bulunanKisi)){
            System.out.println("Silme işlemi yapıldı");
        }


    }

    private static void kisiSorgulaMethodu() {

        System.out.println("Aranılacak kişi adını giriniz. ");
        String isim = tara.next();

        Kisi bulunanKisi = cepTelefonu.kisiSorgula(isim);

        if(bulunanKisi == null){
            System.out.println(isim+" isminde bir kayıt bulunamadı \n");
            return;
        }
        System.out.println("Bulunan kişi : " + bulunanKisi.getIsim() + " ->" +bulunanKisi.getTelNo());
    }

    private static void yeniKisiEkleMethodu() {

        System.out.println("Yeni kişinin adı");
        String isim = tara.next();
        System.out.println("Yeni kişinin telefonu");
        String telefon = tara.next();

        cepTelefonu.ekleYeniKisi(Kisi.olustur(isim,telefon));

    }

    private static void telefonBaslat() {
        System.out.println("Telefon Başlatılıyor...");
    }

    private static void menuGoster(){

        System.out.println("*********** MENU **************");
        System.out.println("0- Çıkış \n" +
                "1- Tüm Kişileri Listele \n" +
                "2- Yeni Kişi Ekle\n" +
                "3- Kişi Sorgula\n" +
                "4- Kişi Sil\n" +
                "5- Kişi Güncelle\n" +
                "6- Menüyü Göster");

    }
}
