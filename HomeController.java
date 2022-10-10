package MiddleLayer;

import UiLayer.WelcomePage;

public class HomeController {
    RegisterController registerControllerObj =new RegisterController();
    LoginController loginControllerObj =new LoginController();
    WelcomePage welcomePageObj =new WelcomePage();
    int enterRegOrLoginOrExitByUser=1;
    public void regOrLoginOrExitByUser() {

        while (enterRegOrLoginOrExitByUser == 1 || enterRegOrLoginOrExitByUser == 2) {
            enterRegOrLoginOrExitByUser = welcomePageObj.regOrLoginOrExit();
            if (enterRegOrLoginOrExitByUser == 1) {
                registerControllerObj.userDetailsWhileRegister();
            } else if (enterRegOrLoginOrExitByUser == 2) {
                loginControllerObj.checkAccount();
            }
        }
        if (enterRegOrLoginOrExitByUser == 3)
        welcomePageObj.userExit();
    }
}
