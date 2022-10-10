package MiddleLayer;
import UiLayer.WelcomePage;

public class Main {
    public static void main(String[] args) {

        //------------------
        WelcomePage welcomePageObj =new WelcomePage();
        HomeController homeControllerObj =new HomeController();
        //---------------------
        welcomePageObj.welcomeUser();
        homeControllerObj.regOrLoginOrExitByUser();

    }
}
