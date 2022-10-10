package UiLayer;

import java.util.Scanner;

public class LoginPage {
    Scanner sc=new Scanner(System.in);
    public String enterPhoneNumber()
    {
        System.out.println("Please enter ur phone number");
        return sc.nextLine();
    }
    public String enterPassword()
    {
        System.out.println("Please enter ur password");
        return sc.nextLine();
    }
    public void ifAccountNotFound()
    {
        System.out.println("Sorry we could not find your Account");
    }
}
