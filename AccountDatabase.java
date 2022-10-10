package DataLayer;

import java.util.ArrayList;
import java.util.List;

public class AccountDatabase {
    private static AccountDatabase accountDatabase;
   private List<Account> registersList=new ArrayList<>();

    private AccountDatabase() {
    }

    public Account getAccountByPhAndPass(String phoneNumber,String Password) {
        for (Account i : registersList) {
            if ((i.getPhoneNumber()).equals(phoneNumber) && (i.getPassword()).equals(Password)) {

                return i;
            }
        }
        return null;
    }
    public void saveRegistersDetails(Account account)
    {
        registersList.add(account);
    }
    public boolean checkRegisteringPhNoAlreadyInRegistersList(String whileRegisterUserPhoneNumber)
    {
        System.out.println(registersList);
        for(Account i:registersList)
        {
            System.out.println(i.getPhoneNumber());
            if((i.getPhoneNumber()).equals(whileRegisterUserPhoneNumber)) {
                return true;

            }

        }
        return false;
    }
    public static AccountDatabase getInstance()
    {
        if(accountDatabase==null)
        {
            accountDatabase=new AccountDatabase();
        }
        return accountDatabase;
    }
}
