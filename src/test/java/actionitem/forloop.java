package actionitem;

public class forloop {
    public static void main(String[] args) {
     // create a string dynamuc array fpr zipcode
        String[] zipcode = new String[5];
        zipcode[0] = "11218";
        zipcode[1] = "10019";
        zipcode[2] = "22219";
        zipcode[3] = "11209";
        zipcode[4] = "10013";

        //create a interate a dynamic array for streetNumber
        int[] streetNumber = new int[4];
        streetNumber[0] = 12;
        streetNumber[1] = 14;
        streetNumber[2] = 16;
        streetNumber[3] = 18;

        //define for loop
        for(int i =0;  i< streetNumber.length;i++){
            System.out.println("My current zipcode " + zipcode[i] + " My street number is " + streetNumber[i]);
        }//end of for loop



    }//end of main method



}//end of java class
