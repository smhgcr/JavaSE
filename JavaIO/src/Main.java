import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalNot) {

        String cikti = "";

        double toplamNot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalNot * 4 / 10.0);

        if(toplamNot >=90){

            cikti = isim + " bu dersten AA aldi...";
        }
        else if(toplamNot>=85){

            cikti = isim + " bu dersten BA aldi... ";
        }

        else if(toplamNot>=80){

            cikti = isim + " bu dersten BB aldi... ";
        }

        else if(toplamNot>=75){

            cikti = isim + " bu dersten CB aldi... ";
        }
        else if(toplamNot>=70){

            cikti = isim + " bu dersten CC aldi... ";
        }

        else if(toplamNot>=65){

            cikti = isim + " bu dersten DC aldi... ";
        }

        else if(toplamNot>=60){

            cikti = isim + " bu dersten DD aldi... ";
        }

        else if(toplamNot>=55){

            cikti = isim + " bu dersten FD aldi... ";
        }

        else {

            cikti = isim + " bu dersten kaldi...";
        }


        return cikti;
    }

    public static void main(String[] args) {


        try(Scanner scanner = new Scanner(new FileReader("dosya.txt"));
        FileWriter writer = new FileWriter("harfnotlari.txt")){

            while(scanner.hasNextLine()){

                String ogrenciBilgileri = scanner.nextLine();

                String[] ogrenciArray = ogrenciBilgileri.split(",");

                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalNot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesapla(ogrenciArray[0],vize1,vize2,finalNot);
                writer.write(cikti + "\n");


            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
