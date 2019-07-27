import java.util.Scanner;

public class Mathematics {

    private double PI = Math.PI;


    public class Factorial {

        public void factorial() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bir sayi giriniz: ");

            int sayi = scanner.nextInt();
            int fact = 1;

            for (int i = 2; i <= sayi; i++) {

                fact *= i;

            }
            System.out.println("Faktoriyel: " + fact);
        }

    }

    public class Prime {

        public boolean isPrime(int sayi) {

            int i = 2;

            while (i < sayi) {

                if (sayi % i == 0) {

                    return false;
                }
                i++;
            }
            return true;
        }

    }

    public class Area {

        public class CircleArea{

            public void circleArea(int radius) {

                System.out.println("Dairenin alani: " + (radius * radius * PI));

            }

        }

    }

}
