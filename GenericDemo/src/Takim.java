import java.util.ArrayList;

public class Takim<T extends Oyuncu> implements Comparable<Takim<T>>{

    private String takimAdi;
    int oynadigiMac = 0;
    int kazandigiMac = 0;
    int kaybettigiMac = 0;
    int berabereKaldigiMac = 0;

    private ArrayList<T> oyuncular = new ArrayList<>();

    public Takim(String isim) {
        this.takimAdi = isim;
    }

    public String getIsim() {
        return takimAdi;
    }

    public boolean oyuncuEkle(T yeniOyuncu) {


        if (oyuncular.contains(yeniOyuncu)) {

            System.out.println(yeniOyuncu.getIsim() + " takimda zaten var!");
            return false;
        }
        oyuncular.add(yeniOyuncu);
        System.out.println(yeniOyuncu.getIsim() + " eklendi!");
        return true;
    }

    public int toplamOyuncuSayisi(){
        return oyuncular.size();
    }

    public void macYap(Takim<T> rakipTakim, int benimSkor, int rakipSkor  ){

        String mesaj="";

        if(benimSkor>rakipSkor){
            mesaj = " kazandı ";
            kazandigiMac++;
        }else if(rakipSkor < benimSkor){
            mesaj = " kaybetti ";
            kaybettigiMac++;
        }else{
            mesaj = " berabere kaldı ";
            berabereKaldigiMac++;
        }
        oynadigiMac++;


        if(rakipTakim != null){
            System.out.println(this.getIsim() + mesaj + rakipTakim.getIsim());
            rakipTakim.macYap(null,rakipSkor,benimSkor);

        }
    }

    public int toplamTakimPuani(){

        return (kazandigiMac*3) + berabereKaldigiMac;

    }


    @Override
    public int compareTo(Takim<T> o) {
        if(this.toplamTakimPuani()> o.toplamTakimPuani()){
            return 1;
        }else if(this.toplamTakimPuani()< o.toplamTakimPuani()){
            return -1;
        }
        return 0;
    }
}