public class Kare implements Karsilastir{

    private double kenarUzunlugu;

    public Kare(){

        kenarUzunlugu = 0;

    }

    public Kare(double kenarUzunlugu){

        this.kenarUzunlugu = kenarUzunlugu;

    }

    public double getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(double kenarUzunlugu) {

        if (kenarUzunlugu < 0){

            this.kenarUzunlugu = 0;
        }
        else{

            this.kenarUzunlugu = kenarUzunlugu;
        }

    }

    public double alanHesapla(){

        return kenarUzunlugu * kenarUzunlugu;
    }

    @Override
    public String karsilastir(Object nesne) {

        Kare k2 = (Kare) nesne;

        if(this.alanHesapla() > k2.alanHesapla()){

            return "Asıl nesnenin alanı, parametre olarak gelen nesnenin alanından BÜYÜKTÜR";

        }
        else if(this.alanHesapla() < k2.alanHesapla()){

            return "Asıl nesnenin alanı, parametre olarak gelen nesnenin alanından KÜÇÜKTÜR";
        }
        else{

            return "Alanlar eşittir";
        }

    }
}
