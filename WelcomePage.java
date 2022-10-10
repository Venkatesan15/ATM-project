package UiLayer;

import java.util.Scanner;

public class WelcomePage {
    Scanner sc=new Scanner(System.in);
    public void welcomeUser()
    {
        System.out.println("_______________________________");
        System.out.println("WELCOME TO ATM");
        System.out.println("_______________________________");
    }
    public int regOrLoginOrExit()
    {
        System.out.println("_______________________________");
        System.out.println("Register--->1");
        System.out.println("Login------>2");
        System.out.println("Exit------->3");
        return sc.nextInt();
    }
    public void userExit()
    {
        System.out.println("Thank You for using our ATM");
        System.out.println("HAVE A GOOD DAY");
    }



}
