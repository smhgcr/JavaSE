public class Main {

    public static void main(String[] args) {

/*
        Ford f = new Ford();
        f.setCantKalinligi(10);
*/

        Araba f = new Ford();
        f.setAgirlik(1500);
        f.setModel("Fiesta");
        f.setRenk("Kırmızı");
        goster(f);

        System.out.println("**********************");

        Araba h = new Honda();
        h.setAgirlik(1000);
        h.setModel("Civic");
        h.setRenk("Beyaz");
        goster(h);



    }

    public static void goster(Araba a){

        System.out.println("Ağırlık: " + a.getAgirlik());
        System.out.println("Model: " + a.getModel());
        System.out.println("Renk : " + a.getRenk());
        System.out.println("Saatte yaktığı Benzin: " + a.saatteYaktigiBenzinLitresi());
    }
}
