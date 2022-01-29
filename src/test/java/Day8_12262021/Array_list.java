package Day8_12262021;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("queens");
        cities.add("manhattan");

        System.out.println("my citi is " + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(112);
        streetNumber.add(113);
        System.out.println("my third city is " + cities.get(2) + " and my third house number is " + streetNumber.get(2));
    }//end of main

}//end of java
