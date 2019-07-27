import java.util.ArrayList;
import java.util.Collections;

public class Lig<T extends Takim> {

    private String isim;
    private ArrayList<T> tumTakimlar = new ArrayList<T>();

    public Lig(String isim) {
        this.isim = isim;
    }

    public boolean takimEkle(T yeniTakim){
        if(tumTakimlar.contains(yeniTakim)){
            System.out.println(yeniTakim.getIsim() + " takımı zaten eklidir!");
            return false;
        }
        else{
            tumTakimlar.add(yeniTakim);
            System.out.println(yeniTakim.getIsim() +" eklenmiştir.");
            return true;
        }
    }

    public void puanTablosu(){

        Collections.sort(tumTakimlar, Collections.reverseOrder());

        for(T gecici : tumTakimlar){
            System.out.println(gecici.getIsim() + " : " + gecici.toplamTakimPuani());
        }
    }
}
