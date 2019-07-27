import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String tersi="";
        Scanner girilen = new Scanner(System.in);
        System.out.println("Kelime girin");
        String kelime = girilen.nextLine(); // Klavyeden girilen string değeri kelime değişkenine atıyoruz

        kelime = kelime.toUpperCase(); // Tüm karakterler büyük harf yapıldı
        kelime = kelime.trim(); // sağdan soldan boşluklar siliniyor
        kelime = kelime.replace(" ",""); // boşluklar siliniyor
        kelime = kelime.replace(",",""); // virgüller siliniyor
        kelime = kelime.replace(".",""); // noktalar siliniyor



        int uzunluk = kelime.length();


        for(int i= uzunluk-1 ; i>=0; i--){

            tersi = tersi + kelime.charAt(i);
        }


        if(kelime.equals(tersi)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Palindrom degil!");
        }


    }
}
