public class Main {

    public static void main(String[] args) {

        //with static inner class

        Mathematics.Area alan = new Mathematics.Area();
        alan.squareArea(4);

        //with static inner class and method

        Mathematics.Area.circleArea(5);

    }
}
