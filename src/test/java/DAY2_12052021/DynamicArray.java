package DAY2_12052021;

public class DynamicArray {
    public static void main(String[] args) {
        //create a string dynamic array for countries
        String[] countries = new String[6]; //you will set limit/boundaries for your array
        //now you define your value by variables indexing
        countries[0]="USA";
        countries[1]="canada";
        countries[2]="Bangladesh";
        countries[3]="India";
        countries[4]="Pakistan";
        countries[5]="Russia";

        System.out.println("My country is " + countries[1]);

        //integer dynamic array
        int[] houseNumber = new int[4];
        houseNumber[0] = 200;
        houseNumber[1] = 400;
        houseNumber[2] = 600;
        houseNumber[3] = 800;
        System.out.println("my country is " + houseNumber[3]);


    }//end of main method


}//end of java class
