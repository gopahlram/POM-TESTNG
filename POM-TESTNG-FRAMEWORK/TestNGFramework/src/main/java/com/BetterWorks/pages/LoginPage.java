package com.BetterWorks.pages;
import com.BetterWorks.constants.FrameworkConstants;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {


    /* Declare Web Elements Here */

    private final By emailField = By.xpath("//input[@name='email']");
    private final By sendCodeBtn = By.xpath("//button[contains(@class,'loginButton')]");
    private final By vcTxtFld = By.xpath("//input[@name='verificationCode']");
    private final By loginBtn = By.xpath("//button[text()='Log In']");
    private final By pageValidation = By.xpath("//span[@class='welcomePanelHeader']");

    /* Declare Strings here */



    /*                  ----------- Declare Page Object Methods -----------------                       */



    /*  This method is to Login in to application using email and verification code
     *
     *   */

    public LoginPage login(String email, String code) {

        send(emailField, email);
        System.out.println("User able to enter email address " +email);
        click(sendCodeBtn);
        System.out.println("User able to click on verification code button");
        send(vcTxtFld, code);
        System.out.println("User able to enter passcode " +code);
        click(loginBtn);
        System.out.println("User able to click on login button");
        explicitlyWaitForElementVisibility(pageValidation,FrameworkConstants.midWaitTime);
        System.out.println("User able to validate welcome message in home page");

        return this;
    }


}