package DAY2_12052021;

public class forLoopWithArray {
    public static void main(String[] args) {
        //interate through all boroughs  defiend by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "staten";
        boroughs[5] = "LI";
        for(int i =0; i< boroughs.length;i++){
            //print statment
            System.out.println("My current boroughis " + boroughs[i]);
        }//end of for loop
    }//end of main

}//end of java class
