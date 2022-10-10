package UiLayer;

import DataLayer.Account;
import DataLayer.AccountDatabase;
import MiddleLayer.CreationValidator;

import java.util.Scanner;

public class Dashboard {
    Scanner sc=new Scanner(System.in);


    public int enterProcess()
    {
        System.out.println("if u want add money--->1");
        System.out.println("if u want check balance--->2");
        System.out.println("if u want withdraw money--->3");
        System.out.println("if u want to change ur password--->4");
        System.out.println("exit----->5");
        System.out.println("_______________________________");
        return sc.nextInt();
    }
    public int enterAmountAdd()
    {
        System.out.println("Please enter amount you add");
        return sc.nextInt();
    }
    public int enterWithdrawAmount()
    {
        System.out.println("Please enter how much money u want");
        return sc.nextInt();
    }
    public void enterChangePassword(Account i)
    {
        CreationValidator changePassObj=new CreationValidator();
        System.out.println("Please Enter Your new Password");
        i.setPassword(changePassObj.checkValidPassword());
        System.out.println("The password is set Successfully");
    }
    public void accountBalance(Account i)
    {
        System.out.println("Your account Balance is " + i.getAccountBalance());
    }
    public void ifWithdrawGreaterBalance(Account i)
    {
        System.out.println("Your account balance is only "+i.getAccountBalance());
    }
    public void ifWithdrawLesserBalance()
    {
        System.out.println("Withdraw Successful");
    }
    public void ifInvalidProcessAfterLogin()
    {
        System.out.println("Please enter the valid input(1,2,3,4)");
        System.out.println("_______________________________");
    }
}
