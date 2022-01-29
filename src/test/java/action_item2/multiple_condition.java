package action_item2;

public class multiple_condition {

    public static void main(String[] args) {
        //define the set of variables
        int grade = 90;

        if(grade>= 90 && grade<= 100){
            System.out.println("grade is A");
        }else if(grade>= 80 && grade<= 89){
            System.out.println("grade is B");
        }else if(grade>= 70 && grade<= 79){
            System.out.println("grade is C");
        }else if(grade>= 60 && grade<= 69){
            System.out.println("grade is D");
        }else if(grade>= 60&& grade<= 49){
            System.out.println("grade is F");
        }


    }//end of main

}//end of java class
