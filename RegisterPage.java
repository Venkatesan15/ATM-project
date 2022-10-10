package UiLayer;

import java.util.Scanner;

public class RegisterPage {
    Scanner sc=new Scanner(System.in);

    public String enterName()
    {
        System.out.println("Please enter ur name in only upper case without any special characters except space");
        return sc.nextLine();
    }

    public int enterAge()
    {
        System.out.println("Please enter ur age");
        System.out.println("your age is must be higher than 18");
        return sc.nextInt();
    }

    public int enterGender()
    {
        System.out.println("Please enter Your Gender");
        System.out.println("Male--------->1");
        System.out.println("Female------>2");
        System.out.println("Prefer not to say-->3");
        return sc.nextInt();
    }

    public String enterPhoneNumber()
    {
        System.out.println("Please enter ur phone number must be 10 digits");
        Scanner scan=new Scanner(System.in);
        return scan.nextLine();
    }

    public String setPassword()
    {
        System.out.println("Please enter ur password");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();

    }
    public String confirmPassword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please reenter the password");
        return sc.nextLine();
    }

    public void registrationSuccessful()
    {
        System.out.println("Registration Successful");
        System.out.println("_______________________________");
    }

    public void ifNameNotValid()
    {
        System.err.println("Please enter valid name");
    }
    public void ifAgeNotValid()
    {
        System.err.println("sorry we could not create an account below 18");
    }
    public void ifGenderNotInTheList()
    {
        System.err.println("Please enter valid Gender");
    }
    public void ifPhoneNumberAlreadyInRegisteredList()
    {
        System.out.println("This phone number is already Registered with our ATM");
    }
    public String ifPasswordsAreNotSame()
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("your password is not same first time u enter");
        System.out.println("Please reenter the password");
        return sc.nextLine();
    }
}
