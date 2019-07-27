public class Dikdortgen extends GeometrikSekil {

    private int en;
    private int boy;

    public Dikdortgen() {

    }

    public Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {

        if (en < 0) {
            this.en = 0;

        } else {

            this.en = en;
        }

    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {

        if (boy < 0) {
            this.boy = 0;

        } else {

            this.boy = boy;
        }

    }

    @Override
    public double alanHesapla() {
        return en * boy;
    }
}