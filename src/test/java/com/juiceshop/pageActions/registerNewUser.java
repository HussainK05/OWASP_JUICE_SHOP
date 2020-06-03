package com.juiceshop.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registerNewUser extends Base{
    private By newCustomer = By.id("newCustomerLink");
    private By email = By.id("emailControl");
    private By pass = By.id("passwordControl");
    private By repeatPass = By.id("repeatPasswordControl");
    private By dpSecurity = By.name("securityQuestion");
    private By selectOption = By.xpath("//span[@class='mat-option-text']");
    private By securityAnswer = By.id("securityAnswerControl");
    private By registerButton = By.id("registerButton");
    private By skipBanner = By.xpath("//span[contains(text(),'Dismiss')]");
    private By myAccount = By.id("navbarAccount");
    private By login = By.id("navbarLoginButton");

    public registerNewUser(WebDriver driver) {
        super(driver);
    }

    public void registerNewUser(String username,String Password) {
        getElement(skipBanner).click();
        getElement(myAccount).click();
        getElement(login).click();
        getElement(newCustomer).click();
        getElement(email).sendKeys(username);
        getElement(pass).sendKeys(Password);
        getElement(repeatPass).sendKeys(Password);
        getElement(dpSecurity).click();
        getElement(selectOption).click();
        getElement(securityAnswer).sendKeys("Test");
        getElement(registerButton).click();
    }

}
