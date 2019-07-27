public class Kare extends GeometrikSekil{

    private int kenar;


    public Kare() {
    }

    public Kare(int kenar) {

        setKenar(kenar);
    }



    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {

        if(kenar < 0 ){

            this.kenar = 0;

        }else{

            this.kenar = kenar;
        }

    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }
}