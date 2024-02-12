package misc;

import java.util.ArrayList;
import java.util.List;

public class ListExemple {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("BAnana");
        fruits.add("Cherry");
        fruits.add("Date");

        for( String fruit : fruits){
            System.out.println(fruit);
        }




    }


}
