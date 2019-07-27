import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        LinkedList<String> gidilecekYerler = new LinkedList<>();

        List<String> list1 = new LinkedList<>();


       /* gidilecekYerler.add("Postane");
        gidilecekYerler.add("Market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kutuphane");
        gidilecekYerler.add("SporSalonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);

        System.out.println("-----------ADD NEW ITEM---------------------");

        gidilecekYerler.add(4, "Alışveriş Merkezi");
        listeyiBastir(gidilecekYerler);

        System.out.println("------------REMOVE OPERATION----------------");


        gidilecekYerler.remove(3);
        listeyiBastir(gidilecekYerler);*/

        System.out.println("-------------------------------------------");

        siraliEkle(gidilecekYerler, "Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler,"Ev");

        listeyiBastir(gidilecekYerler);


    }

    public static void siraliEkle(LinkedList<String> gidilecekYerler, String yeni) {

        ListIterator<String> iterator = gidilecekYerler.listIterator();


        while (iterator.hasNext()) {

            int karsilastir = iterator.next().compareTo(yeni);

            // Iki deger esitse
            if (karsilastir == 0) {

                System.out.println("Listeniz bu eleman zaten var");
                return;

            } else if (karsilastir < 0) {

                // Yeni deger iterator.next ten daha buyuk

            } else if (karsilastir > 0) {

                iterator.previous();
                iterator.add(yeni);

                return;

            }

        }
        iterator.add(yeni);

    }

    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {

        /*for(String temp : gidilecekYerler){
            System.out.println(temp);
        }*/

        ListIterator<String> iterator = gidilecekYerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
