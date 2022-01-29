package DAY4_12122021;

public class loop_array_condition {
    public static void main(String[] args) {
        //create dynamic array for 4 cities, interate the velues but only print when the city is
        //either Brooklyn or queens
        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Manhattan";
        cities[2] = "Brooklyn";
        cities[3] = "Bronx";

       int i = 0;
       while(i <cities.length){
           //two if condition
           if (cities[i] == "Brooklyn"){
               System.out.println("city is " + cities[i]);
           }else if(cities[i] == "Queens") {
               System.out.println("city is " + cities[i]);
           }//end of conditions

           i++;

       }//end of for loop


    }//end of main


}//end of java class
