import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> diller = new ArrayList<>();

        diller.add("JAVA");
        diller.add("PHP");
        diller.add("Phyton");
        diller.add("Kotlin");
        diller.add("CSharp");


        /*for(int i=0; i< diller.size(); i++){

            System.out.println(diller.get(i));
        }*/

        for(String temp : diller)
        {
            System.out.println(temp);
        }
        System.out.println("------------------------------");

        diller.add(1,"C++");

        for(String temp : diller)
        {
            System.out.println(temp);
        }


    }
}
