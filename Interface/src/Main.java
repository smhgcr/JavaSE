public class Main {

    public static void main(String[] args) {


        Kare k1 = new Kare(9);
        Kare k2 = new Kare(7);

        System.out.println("Kare alan karşılaştırması: \n" +
                "Asıl nesne alanı: " + k1.alanHesapla()+"\n" +
                "Parametre nesne alanı: " +k2.alanHesapla() +"\n" +
                k1.karsilastir(k2));

        System.out.println("\n ******* \n");

        Personel p1 = new Personel(26);
        Personel p2 = new Personel(35);

        System.out.println("Personel yaş karşılaştırması: \n" +
                "Asıl personel nesnesinin yaşı: " + p1.getYas()+ "\n" +
                "Parametre olan personel nesnesinin yaşı: " + p2.getYas()+ "\n" +
                p1.karsilastir(p2));


        // Second Way with polymorphism
        System.err.println("\n Polimorfizm kullanılarak örneklendirildi. \n");

        nesneKarsilastir(k1,k2);
        nesneKarsilastir(p1,p2);

    }

    public static void nesneKarsilastir(Karsilastir nesne1, Karsilastir nesne2){

        System.out.println("Karşılaştırma: " + nesne1.karsilastir(nesne2));

    }
}
