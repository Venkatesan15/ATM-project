package MiddleLayer;

import DataLayer.Account;
import UiLayer.Dashboard;
public class AccountProcessor {


    Dashboard dashboardObj =new Dashboard();

    public void addMoney(Account i)
    {
        int AmountAdd;
        AmountAdd= dashboardObj.enterAmountAdd();
        int currentBalance=i.getAccountBalance();
        currentBalance+=AmountAdd;
        i.setAccountBalance(currentBalance);
    }
    public void withdraw(Account i)
    {
        int WithdrawAmount;
        WithdrawAmount= dashboardObj.enterWithdrawAmount();
        if(WithdrawAmount>i.getAccountBalance())
            dashboardObj.ifWithdrawGreaterBalance(i);
        else {
            dashboardObj.ifWithdrawLesserBalance();
            int currentAmountInAccount=i.getAccountBalance();
            currentAmountInAccount-=WithdrawAmount;
            i.setAccountBalance(currentAmountInAccount);
        }
    }
    public void accountBalance(Account i)
    {
        dashboardObj.accountBalance(i);
    }
    public  void changePassword(Account i)
    {
        dashboardObj.enterChangePassword(i);
    }
}
