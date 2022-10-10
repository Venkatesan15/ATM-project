package MiddleLayer;
import DataLayer.Account;
import DataLayer.AccountDatabase;
import UiLayer.Dashboard;

public class LoginController {
    private AccountDatabase accountDatabase=AccountDatabase.getInstance();


    UiLayer.LoginPage loggingInObj=new UiLayer.LoginPage();
    public void checkAccount()
    {
        String phoneNumber,password;
        phoneNumber = loggingInObj.enterPhoneNumber();
        password = loggingInObj.enterPassword();
        loginPage(phoneNumber,password);

    }
    public void loginPage( String phoneNumber, String password)
    {
        Dashboard loginPrintObj=new Dashboard();
        AccountProcessor accountProcessorObj =new AccountProcessor();
        Account i=accountDatabase.getAccountByPhAndPass(phoneNumber,password);
        if (i==null) {
            loggingInObj.ifAccountNotFound();
        }
        else
        {
            int UserInputForAccountProcess=1;
            while(UserInputForAccountProcess!=5) {
                UserInputForAccountProcess= loginPrintObj.enterProcess();
                if(UserInputForAccountProcess<5) {
                    switch (UserInputForAccountProcess) {
                        case 1:
                            accountProcessorObj.addMoney(i);
                            break;
                        case 2:
                            accountProcessorObj.accountBalance(i);
                            break;
                        case 3:
                            accountProcessorObj.withdraw(i);
                            break;
                        case 4:
                            accountProcessorObj.changePassword(i);
                            break;
                        }
                    }
                    else if(UserInputForAccountProcess>5){
                        loginPrintObj.ifInvalidProcessAfterLogin();
                    }
                }
        }
    }
}
