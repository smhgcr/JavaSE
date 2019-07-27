public class Personel implements Karsilastir {

    private int yas;


    public Personel(){

        this.yas = 0;
    }

    public Personel(int yas){

        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String karsilastir(Object nesne) {
        Personel p2 = (Personel) nesne;

        if(this.getYas() > p2.getYas()){

            return "Asıl personel nesnesinin yaşı, parametre olarak gelen personel nesnesinin yaşından BÜYÜKTÜR";
        }
        else if(this.getYas() < p2.getYas()){

            return "Asıl personel nesnesinin yaşı, parametre olarak gelen personel nesnesinin yaşından KÜÇÜKTÜR";
        }
        else{

            return "Personel nesnelerinin yaşı eşittir";
        }

    }
}
