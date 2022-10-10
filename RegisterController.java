package MiddleLayer;

import DataLayer.Account;
import DataLayer.AccountDatabase;
import UiLayer.RegisterPage;

public class RegisterController {
    private AccountDatabase accountDatabase=AccountDatabase.getInstance();
    public void userDetailsWhileRegister()
    {
        CreationValidator creationValidatorObj =new CreationValidator();
        String name= creationValidatorObj.checkValidName();
        int age= creationValidatorObj.checkValidAge();
        String gender= creationValidatorObj.checkValidGender();
        String phoneNumber= creationValidatorObj.checkValidPhoneNumber();
        String password= creationValidatorObj.checkValidPassword();
        Account account = new Account(name,age,gender,phoneNumber,password,0);
        accountDatabase.saveRegistersDetails(account);
        RegisterPage registerPageObj =new RegisterPage();
        registerPageObj.registrationSuccessful();
    }
}
