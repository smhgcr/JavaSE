public class Ford extends Araba {

    private int cantKalinligi;

    public int getCantKalinligi() {
        return cantKalinligi;
    }

    public void setCantKalinligi(int cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }

    @Override
    public int saatteYaktigiBenzinLitresi() {
        return this.getAgirlik() * 2;
    }
}
