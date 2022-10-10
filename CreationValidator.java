package MiddleLayer;

import DataLayer.AccountDatabase;
import UiLayer.RegisterPage;

public class CreationValidator
{
    RegisterPage registerPageObj =new RegisterPage();

    AccountDatabase accountDatabase=AccountDatabase.getInstance();


    public String checkValidPassword()
    {
        String pass,pass1;
        pass= registerPageObj.setPassword();
        pass1= registerPageObj.confirmPassword();
        while(!(pass.equals(pass1)))
        {
            pass1=registerPageObj.ifPasswordsAreNotSame();
        }
        return pass;
    }
    protected String checkValidGender()
    {
        int gender;
        gender= registerPageObj.enterGender();
        if(gender==1)
            return "Male";
        else if(gender==2){
            return "Female";
        } else if (gender==3) {
            return "Prefer Not To Say";
        }
        else {
            registerPageObj.ifGenderNotInTheList();
            return checkValidGender();
        }
    }
    protected String checkValidPhoneNumber()
    {


        int c=1,c1=0;
        String whileRegisterUserPhoneNumber= registerPageObj.enterPhoneNumber();
        if((whileRegisterUserPhoneNumber.length()==10))
            c1=1;
        if(accountDatabase.checkRegisteringPhNoAlreadyInRegistersList(whileRegisterUserPhoneNumber))
        {
            registerPageObj.ifPhoneNumberAlreadyInRegisteredList();
            c=0;
        }
        if(c1==0||c==0)
        {
            whileRegisterUserPhoneNumber=checkValidPhoneNumber();
        }

        return whileRegisterUserPhoneNumber;
    }
    protected int checkValidAge()
    {
        int age;
        age= registerPageObj.enterAge();
        if(age>17)
            return age;
        else
        {
            registerPageObj.ifAgeNotValid();
            age=checkValidAge();
            return age;
        }
    }
    protected String checkValidName()
    {
        String name;
        int upperCaseCountInName=0;
        name= registerPageObj.enterName();
        for(char i:name.toCharArray())
        {
            if((i>=65&&i<=90)||i==' ')
            {
                upperCaseCountInName++;
            }
        }
        if(upperCaseCountInName==name.length())
            return name;
        else
        {
            registerPageObj.ifNameNotValid();
            name=checkValidName();
            return name;
        }

    }
}
