package DataLayer;

public class Account {
    String name,gender;
    private String phoneNumber;
    private String password;
    int age;
    private int accountBalance;
    public Account(String name, int age, String gender, String phoneNumber, String password, int accountBalance)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        setPhoneNumber(phoneNumber);
        setPassword(password);
        setAccountBalance(accountBalance);
    }
    public int getAccountBalance()
    {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance=accountBalance;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }

}
