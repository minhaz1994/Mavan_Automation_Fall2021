package action_item5;

import Day9_01082022.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.ArrayList;

public class testing_hulu {
    WebDriver Driver;

    @BeforeSuite
    public void setDriver(){
        Driver = Reusable_Actions.setDriver();
        Driver.navigate().to("https://www.hulu.com");
    }//end of the precondition



    @Test(priority = 1)
    public void CreateAccountOnHulu(){
        ArrayList<String > email = new ArrayList<>();
        email.add("Rahmanminhaz447@gmail.com");

        ArrayList<String > password = new ArrayList<>();
        password.add("11223344mR");

        ArrayList<String > name = new ArrayList<>();
        name.add("Minhaz Rahman");

        ArrayList<String > month = new ArrayList<>();
        month.add("october");

        ArrayList<String > Day = new ArrayList<>();
        Day.add("1");

        ArrayList<String > year = new ArrayList<>();
        year.add("1994");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("male");

        for(int i = 0; i <email.size(); i++){
            String actualTitle = Driver.getTitle();
            if(actualTitle.contains("Stream TV and Movies")){
                System.out.println("Title contains 'Stream TV and Movies'");
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            Reusable_Actions.scrollMethod(Driver,"0","1100","scroll");

            Reusable_Actions.clickMethod(Driver,"//*[text()='SELECT']","select");

            Reusable_Actions.sendKeysMethod(Driver,"//*[@id='email']",email.get(i),"email");

            Reusable_Actions.sendKeysMethod(Driver,"//*[@id='password']",password.get(i),"password");

            Reusable_Actions.sendKeysMethod(Driver,"//*[@id='firstName']",name.get(i),"name");

            Reusable_Actions.clickMethod(Driver,"//*[@class='selector-selected input__text placeholder']","click month");
            Reusable_Actions.selectMethode(Driver,"//*[@id='birthdayMonth-menu']",month.get(i),"birth month");

            Reusable_Actions.clickMethod(Driver,"//*[@class='selector-selected input__text placeholder']","click day");
            Reusable_Actions.selectMethode(Driver,"//*[@id='birthdayDay-menu']",Day.get(i),"Day");

            Reusable_Actions.clickMethod(Driver,"//*[@class='selector-selected input__text placeholder']","click year");
            Reusable_Actions.selectMethode(Driver,"//*[@id='birthdayYear-menu']",year.get(i),"birth year");

            Reusable_Actions.clickMethod(Driver,"//*[@class='selector-selected input__text placeholder']","click gender");
            Reusable_Actions.selectMethode(Driver,"//*[@id='gender-menu']",gender.get(i),"select gender");

            Reusable_Actions.clickMethod(Driver,"//*[contains(@class,'button button--continue')]","continue");

            String resultValue = Reusable_Actions.getTextMethod(Driver,"//*[@class='ledger__price']","subscriptionAmount");
            String[] arrayResult = resultValue.split("/mo");
            System.out.println("My subscription amount is " + arrayResult[0]);

            String result = Reusable_Actions.getTextMethod(Driver,"//*[@class='ledger__summary']","Amount");
            System.out.println(result);

            Driver.manage().deleteAllCookies();
        }

    }//end of test1

    @Test(dependsOnMethods="CreateAccountOnHulu")
    public void login(){
        Driver.navigate().to("https://www.hulu.com");
        Reusable_Actions.clickMethod(Driver,"//*[text()='Log In']","login");
        Reusable_Actions.sendKeysMethod(Driver,"//*[@id='email_id']","Rahmanminhaz447@gmail.com","email");
        Reusable_Actions.sendKeysMethod(Driver,"//*[@id='password_id']","11223344mR","password");
        Reusable_Actions.clickMethod(Driver,"//*[test()='LOG IN']","login");
        String result = Reusable_Actions.getTextMethod(Driver,"//*[text()='Minhaz Rahman']","user name");
        System.out.println("user name is " +result);

    }//end of test case 2
    @AfterSuite
    public void quitSession(){
        Driver.quit();
    }

}//end of the class

