package DAY2_12052021;

public class whileloop {
    public static void main(String[] args) {
        //interate through all boroughs  defiend by dynamic array using for loop
        String[] boroughs = new String[6];
        boroughs[0] = "Brooklyn";
        boroughs[1] = "Queens";
        boroughs[2] = "manhattan";
        boroughs[3] = "Bronx";
        boroughs[4] = "staten";
        boroughs[5] = "LI";

        //declare and define the initial point
        int i = 0;
        //define while loop with your end point(condition)
        while(i<boroughs.length){
            System.out.println("my current borough is " + boroughs[i]);
            i=i+1; //if there is no incrementation, the while loop become infinity loop
        }

    }//end of main


}//end of java class
