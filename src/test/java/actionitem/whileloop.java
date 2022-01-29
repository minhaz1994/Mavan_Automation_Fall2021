package actionitem;

public class whileloop {
    public static void main(String[] args) {
        //create a string dynamic array for streetNumber
        String[] streetNumber = new String[5];
        streetNumber[0] = "2";
        streetNumber[1] = "4";
        streetNumber[2] = "6";
        streetNumber[3] = "8";
        streetNumber[4] = "10";

        //create a interate dynamic array for zipcode
        int[] zipcode = new int[4];
        zipcode[0] = 11218;
        zipcode[1] = 10019;
        zipcode[2] = 11209;
        zipcode[3] = 10013;

        int i = 0;
        while(i<zipcode.length){
            System.out.println(" my current streetNumber " +streetNumber[i] + " my zipcode is " +zipcode[i]);
            i=i+1;


        }





    }//end of main mathod

}//end of java class
