public class Honda extends Araba {

    private int beygirGucu;

    public int getBeygirGucu() {
        return beygirGucu;
    }

    public void setBeygirGucu(int beygirGucu) {
        this.beygirGucu = beygirGucu;
    }

    @Override
    public int saatteYaktigiBenzinLitresi() {
        return this.getAgirlik();
    }
}
