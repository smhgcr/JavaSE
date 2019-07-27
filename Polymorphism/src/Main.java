public class Main {

    public static void main(String[] args) {


            GeometrikSekil gs1 = new GeometrikSekil();

            Dikdortgen d1 = new Dikdortgen(6,11);

            Kare k1 = new Kare(9);

            sekilAlanlari(d1);
            sekilAlanlari(k1);

        }

        public static void sekilAlanlari(GeometrikSekil sekil){

            System.out.println("Alan bilgisi : " + sekil.alanHesapla());
        }
    }

