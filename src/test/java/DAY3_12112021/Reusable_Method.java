package DAY3_12112021;

public class Reusable_Method {

    //create a void method that will add two numbers
    public static void add(int x, int y){
        System.out.println("Result of addition is " +(x+y));
    }//end of add method

    //create a void method that will subtract two numbers
    public static void subtract(int x, int y){
        System.out.println("Result of subtraction is " +(x-y));
    }//end of subtract method

    //creat a return method that will add two number and return the result of it
    public static int addReturn(int x, int y){
        //declare and define a new int variable to store x+y
        int result = x+y;
        System.out.println("Result of addition is " + result);
        //returing the variable result which is storing x+y values
        return result;
    }//end of the addreturn method


}//end of java class
