import java.util.*;

public class Main {

    public static void mapYazdir(Map<Integer,String> map){

        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Phython");
        map.put(2,"Php");
        map.put(100,"C");

        /*for(Map.Entry<Integer,String> entry : map.entrySet()){

            System.out.println("Key: " + entry.getKey() + " -----> " + "Value: " + entry.getValue());
        }*/


        //System.out.println(map.keySet());  // Sadece KEY'leri ekrana yazdirmak icin



     /*   for(Integer key : map.keySet()){

            System.out.println("KEY " + key + " ----> " + map.get(key));
        }*/

        Collection<String> values = map.values();

        for(String temp : values){

            System.out.println(temp);


        }

    }

    public static void main(String[] args) {

        Map<Integer,String> hashmap = new HashMap<Integer,String>();
        Map<Integer,String> linkedhashmap = new LinkedHashMap<>();
        Map<Integer,String> treemap = new TreeMap<>();


        System.out.println("***********HashMap********************");
        mapYazdir(hashmap);

        System.out.println("***********LinkedHashMap********************");
        mapYazdir(linkedhashmap);

        System.out.println("***********TreeMap********************");
        mapYazdir(treemap);





    }

}

