public class Main {

    public static void main(String[] args) {

        String[] stringDizi = {"abc","def","klm"};
        Integer[] intDizi = {1,2,3};
        Double[] doubleDizi = {1.2,2.5,3.6};
        Character[] charDizi = {'a','b','c'};


        /*
        ! if do not use GenericClass, we will track this way

        StringDiziYaz s1 = new StringDiziYaz();
        s1.yazdir(stringDizi);

        IntegerDiziYaz i1 = new IntegerDiziYaz();
        i1.yazdir(intDizi);

        DoubleDiziYaz d1 = new DoubleDiziYaz();
        d1.yazdir(doubleDizi);

        CharDiziYaz c1 = new CharDiziYaz();
        c1.yazdir(charDizi);

        */

        DiziYazdir<String> s2 = new DiziYazdir<>();
        s2.yazdir(stringDizi);

        DiziYazdir<Integer> i2 = new DiziYazdir<>();
        i2.yazdir(intDizi);

        DiziYazdir<Double> d2 = new DiziYazdir<>();
        d2.yazdir(doubleDizi);

        DiziYazdir<Character> c2 = new DiziYazdir<>();
        c2.yazdir(charDizi);



    }
}
