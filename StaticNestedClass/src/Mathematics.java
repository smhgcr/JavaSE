public class Mathematics {

    public static class Area {

        private static double PI = Math.PI;

        public void squareArea(int edge) {

            System.out.println("Karenin alani: " + (edge * edge));

        }

        public static void circleArea(int radius) {

            System.out.println("Dairenin alani: " + (radius * radius * PI));
        }

    }
}
