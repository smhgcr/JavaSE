import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Mathematics.Factorial factoriyel = new Mathematics().new Factorial();
        Mathematics.Prime asal = new Mathematics().new Prime();
        Mathematics.Area alan = new Mathematics().new Area();
        Mathematics.Area.CircleArea circleArea = new Mathematics().new Area().new CircleArea();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int sayi = scanner.nextInt();


        if(asal.isPrime(sayi)){

            System.out.println("Bu sayi asaldir.");
        }else{

            System.out.println("Bu sayi asal degildir.");
        }

        factoriyel.factorial();

       // alan.circleArea(5);

        circleArea.circleArea(5);


    }
}
